# CI/CD & IaC Tech Lab

[![CI/CD passing](https://github.com/lucasbaldassari/lab-ci-cd-aws/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/lucasbaldassari/lab-ci-cd-aws/actions/workflows/ci-cd.yml)

## Overview

This repository is a technical laboratory designed to explore the implementation of a CI/CD pipeline using GitHub Actions integrated with Amazon Web Services and infrastructure provisioning using Terraform. The project focuses on automating the integration and deployment process, where Terraform provisions a serverless Fargate infrastructure within an Amazon ECS cluster.

## Whats is CI/CD?
CI/CD stands for Continuous Integration and Continuous Deployment, a cornerstone of modern DevOps that automates the software delivery lifecycle. Continuous Integration ensures that code changes are frequently merged, built, and tested in a shared repository to detect issues early. Continuous Deployment extends this by automatically shipping validated changes to production environments, minimizing manual intervention, reducing human error, and accelerating the feedback loop between development and end-users.

## Whats is Infrastructure as Code?
Infrastructure as Code (IaC) is the practice of managing and provisioning computing infrastructure through machine-readable definition files, rather than manual hardware configuration or interactive dashboard tools. By treating infrastructure the same way as application code, teams can leverage version control, automated testing, and rapid reproducibility. This ensures that environments—from networks to serverless clusters—are consistent, scalable, and easy to recover, significantly reducing the risk of human error during deployment.

## Stack stack

- Java 21 & Spring Boot 3.5
- Docker
- Terraform
- GitHub Actions
- Amazon Web Services
