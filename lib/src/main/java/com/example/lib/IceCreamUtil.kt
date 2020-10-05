package com.example.lib

fun flavorOrDefault(iceCream: IceCream) =
    if (iceCream == IceCream.UNSPECIFIED) IceCream.CHOCOLATE else iceCream
