package base;

import logging.LogEngine;

public class Flap implements IFlap {

    private String id;

    public Flap(String id){
        this.id=id;
    }

    @Override
    public void up() {
        LogEngine.instance.write("*** Flap "+id+" up ***");
    }

    @Override
    public void down() {
        LogEngine.instance.write("*** Flap "+id+" down ***");
    }
}
