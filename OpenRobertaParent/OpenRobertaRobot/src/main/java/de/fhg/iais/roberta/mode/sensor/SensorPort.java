package de.fhg.iais.roberta.mode.sensor;

import de.fhg.iais.roberta.inter.mode.sensor.ISensorPort;

public enum SensorPort implements ISensorPort {
    NO_PORT,
    X( "X", "Pitch" ),
    Y( "Y", "Roll" ),
    Z( "Z", "Yaw" ),
    STRENGTH( "STRENGTH" ),
    S0( "0", "P12" ),
    S1( "1", "P0" ),
    S2( "2", "P1" ),
    S3( "3", "P16" ),
    S4( "4", "P19" ),
    S5( "5", "P2" ),
    S6( "6" ),
    S7( "7" ),
    S8( "8" ),
    S9( "9" ),
    S10( "10" ),
    ANY( "3" ),
    BOTH( "3" ),
    MOTOR_LEFT( "2" ),
    MOTOR_RIGHT( "1" ),
    TEST1( "Test1" ),
    TEST2( "Test2" );

    private final String[] values;

    private SensorPort(String... values) {
        this.values = values;
    }

    @Override
    public String[] getValues() {
        return this.values;
    }

    @Override
    public String getPortNumber() {
        return this.values[0];
    }

}
