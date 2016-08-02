# springmvc-quickstart

Overview
--------

This is a sandbox dead simple project, used to decide whether a full Spring based stack would be suitable for a full stack web application to be built.   
For now, it's using the following stack:

- H2 as an in-memory DB
- Spring Data to handle the persistance layer
- Spring Framework to provide dependency injection
- Spring MVC for the web layer
- Thymeleaf as a template engine

So, this application is a n-tier client-server webapp:

1. The view layer, rendered as HTML
2. The web layer (controllers)
3. The service layer, to do some required processing (although right now is pretty empty)
4. The persistance layer

No JavaScript (not even AJAX calls) for now, no REST API, this is a pretty old-school webapp. Bootstrap was added to make sure local libreries were loaded.

Future steps
------------

1. Add a REST client and pull data from any open API out there, and render it in a new controller
2. Add a real DB
3. Add Spring Security
