# Architecture Reference
## Microservice "Hello world" 
## by Software Engineering

Index
----
- [Summary](#Summary)
- [Concepts](#Concepts)
- [Getting started](#Getting-started)
- [Contributing](#Contributing)
- [Maintainers](#Maintainers)

Summary
---
This repository containt one microservice hello world, the architype use spring framework and represent demo style. 
implement github workflow from [reference architecture](https://github.com/Iberia-Ent/software-engineering--reference-architecture--workflow/blob/main/README.md). this workflow deploy software to best practice aws account.

Concepts
---
The objective of this repository is to offer the development prototypes demo necessary to create and deploy software code demostrate. the workflow that must be executed through the Action Github custom by software engineering.

For this repository to work properly there must be two main branches.

Branches to have:
  * main  
  * develop

We consider the mian branch to contain the production code. the develop branch extends from the main branch. the develop branch is where developers commit their changes to the development phase. We recommend developers extend from the develop branch for each feature or fix. Once the change is complete, run a pull request event to the develop branch. this will activate the deployment to the development environment and it did generated an EC2 instance
After verifying that the software works correctly, perform a pull request event from the develop branch to the main branch. this action triggers the deployment to the publishing environments ( preproduction or production ). 
In this phase, an image was generated that will be preserved for later deployment or restoration in the deployment environments. At the end of the deployment, the code is labeled with the version of the package and also references the identifier of the image.

> As best practices, once the whole process is finished, delete all the branches, leaving the main branch with production code.

Getting started
---
The project contains a file called pom.xml, it is important that this file contains the version and the domain and the name of the package being developed, in our example it is **com.iag.swe.demo** with version **1.0.0-SNAPSHOT**. when the software deploys to publish environment the final version and the repository tag will be 1.0.0 version. The process deploy controls which versions are used. If a version already exists as a tag, it'll request that it be increased to publish environment.
````
....
<groupId>com.aig.swe</groupId>
<artifactId>demo</artifactId>
<version>1.0.0-SNAPSHOT</version>
<packaging>jar</packaging>
....
````
This repository implements the github action in the path .github/action.yml. the action implements the workflow of the [reference architecture](https://github.com/Iberia-Ent/software-engineering--reference-architecture--workflow/blob/main/README.md). the configuration can be consulted in [developers.md](https://github.com/Iberia-Ent/software-engineering--reference-architecture--workflow/blob/main/DEVELOPERS.md).

For the workflow to work, there must be a repository of derivatives, this repository can be nexus or codeartifact depending on how it is configured.
This example uses the aws best practice account to build and deploy the software to both a development and production infrastructure.
````
...
 aws-access-key: ${{secret.aws-access-key}}
 aws-secret-acesss-key: ${{secret.aws-secret-access-key}}
... 
 aws-access-key-dev: ${{secret.aws-access-key}}
 aws-secret-acesss-key-dev: ${{secret.aws-secret-access-key}}
...
````
the workflow has the same secret configured for both environments. In a real situation the secret will be different for each environment. with this configuration the secrets aren't necessary.

We recommend that the image be kept in a separate account from the environments.
````
....
 aws-access-key-op:                                # access key aws operational environment, this account containt shared image 
 aws-secret-acesss-key-op:                         # secret access key aws operational environment, this account containt shared image 
....
````
Contributing
---
Briefly explains how your team members or others can contribute to the project

For the contribution and workflow guide, see [CONTRIBUTING.md](./CONTRIBUTING.md).

Maintainers
---
Contact information of the team member whose is responsible for the project, see [CONTRIBUTING.md](./CONTRIBUTING.md).
