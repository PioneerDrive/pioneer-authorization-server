# pioneer-authorization-server
Authorization Server

Sample Get Auth Token:

- curl clientId:secret@localhost:9000/oauth/token -d grant_type=client_credentials
- curl -u clientId:secret -X POST localhost:9000/oauth/token?grant_type=password&username=user&password=pass
