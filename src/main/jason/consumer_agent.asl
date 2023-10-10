!consumer.

+!consumer : true <-
    take;
    !consume;
    !consumer.

+!consume : true <-
    .wait(1000).

{ include("$jacamoJar/templates/common-cartago.asl") }
{ include("$jacamoJar/templates/common-moise.asl") }