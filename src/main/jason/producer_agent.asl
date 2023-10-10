!producer.

+!producer : true <-
    !produce;
    put;
    !producer.

+!produce: true <-
    .wait(1000).

{ include("$jacamoJar/templates/common-cartago.asl") }