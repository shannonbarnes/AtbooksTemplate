# Catapult CI/CD engine 

Catapult framework is collection of Ansible roles and tools to support [CI/CD
process](https://docs.google.com/presentation/d/1j5GUchdej5_jgaPte_EOR9A8s6TSwV3U5fr9ZkH9R2g/edit?usp=sharing).

It is supposed to be used with other tools such as:

* [Screwdriver templates](https://git.ouroath.com/video-cms/ops-screwdriver-templates)
* Build plugins:
  * [Maven](https://git.ouroath.com/video-cms/cicd-maven-plugin)
  * [Sbt](https://git.ouroath.com/video-cms/ops-sbt-plugins)
* Secrets management
* [Service inventory and discovery](https://docs.google.com/presentation/d/1IlRDHgj7xRmSOqR1PJ0kpkGQLfQzHcX9i2_pmUgBiDA/edit?usp=sharing)
* AWS Resource garbage collection

and expects application specific details on deployment and configuration to
be packaged in the deployable.zip artifact (normaly it is stored in the
application repo and packaged using build plugins).

Catapult repo also contains details on supported AWS environments (e.g.
subnets, security groups, etc for each region/account).

Following picture gives an overview of what tools are used for what stage in
CI/CD process. Please refer to docs folder and projects listed above for
additional info.

![10000ft View](docs/images/10000ft.png)
