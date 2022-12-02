#!/bin/bash
docker build -t us-docker.pkg.dev/sap-mc-cerberus-dev/cerberus-backend/${{values.component_id}} .
