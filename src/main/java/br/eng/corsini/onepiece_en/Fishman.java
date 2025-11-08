package br.eng.corsini.onepiece_en;

public class Fishman extends Being {
    private String type;
    private float waterSpeed;

    public void doubleSpeed(Fishman fishman) {
        if (fishman.getHeight() > 2.0f)
            fishman.setWaterSpeed(fishman.getWaterSpeed() * 2);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getWaterSpeed() {
        return waterSpeed;
    }
    public void setWaterSpeed(float waterSpeed) {
        this.waterSpeed = waterSpeed;
    }
}
