package com.yandex.mapkit.location;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LocationSettings implements Serializable {
    private Range accuracy;
    private Range headingError;
    private LocationError locationError;
    private TimeInterval locationTimeInterval;
    private boolean provideAccuracy;
    private boolean provideHeading;
    private boolean provideSpeed;
    private boolean provideWheelSpeed;
    private double speed;
    private TimeInterval wheelSpeedTimeInterval;

    public LocationSettings(boolean z13, Range range, TimeInterval timeInterval, boolean z14, double d13, boolean z15, Range range2, LocationError locationError, boolean z16, TimeInterval timeInterval2) {
        this.provideAccuracy = z13;
        this.accuracy = range;
        this.locationTimeInterval = timeInterval;
        this.provideSpeed = z14;
        this.speed = d13;
        this.provideHeading = z15;
        this.headingError = range2;
        this.locationError = locationError;
        this.provideWheelSpeed = z16;
        this.wheelSpeedTimeInterval = timeInterval2;
    }

    public Range getAccuracy() {
        return this.accuracy;
    }

    public Range getHeadingError() {
        return this.headingError;
    }

    public LocationError getLocationError() {
        return this.locationError;
    }

    public TimeInterval getLocationTimeInterval() {
        return this.locationTimeInterval;
    }

    public boolean getProvideAccuracy() {
        return this.provideAccuracy;
    }

    public boolean getProvideHeading() {
        return this.provideHeading;
    }

    public boolean getProvideSpeed() {
        return this.provideSpeed;
    }

    public boolean getProvideWheelSpeed() {
        return this.provideWheelSpeed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public TimeInterval getWheelSpeedTimeInterval() {
        return this.wheelSpeedTimeInterval;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.provideAccuracy = archive.add(this.provideAccuracy);
        this.accuracy = (Range) archive.add(this.accuracy, true, (Class<Range>) Range.class);
        this.locationTimeInterval = (TimeInterval) archive.add(this.locationTimeInterval, true, (Class<TimeInterval>) TimeInterval.class);
        this.provideSpeed = archive.add(this.provideSpeed);
        this.speed = archive.add(this.speed);
        this.provideHeading = archive.add(this.provideHeading);
        this.headingError = (Range) archive.add(this.headingError, true, (Class<Range>) Range.class);
        this.locationError = (LocationError) archive.add(this.locationError, true, (Class<LocationError>) LocationError.class);
        this.provideWheelSpeed = archive.add(this.provideWheelSpeed);
        this.wheelSpeedTimeInterval = (TimeInterval) archive.add(this.wheelSpeedTimeInterval, true, (Class<TimeInterval>) TimeInterval.class);
    }

    public LocationSettings setAccuracy(Range range) {
        this.accuracy = range;
        return this;
    }

    public LocationSettings setHeadingError(Range range) {
        this.headingError = range;
        return this;
    }

    public LocationSettings setLocationError(LocationError locationError) {
        this.locationError = locationError;
        return this;
    }

    public LocationSettings setLocationTimeInterval(TimeInterval timeInterval) {
        this.locationTimeInterval = timeInterval;
        return this;
    }

    public LocationSettings setProvideAccuracy(boolean z13) {
        this.provideAccuracy = z13;
        return this;
    }

    public LocationSettings setProvideHeading(boolean z13) {
        this.provideHeading = z13;
        return this;
    }

    public LocationSettings setProvideSpeed(boolean z13) {
        this.provideSpeed = z13;
        return this;
    }

    public LocationSettings setProvideWheelSpeed(boolean z13) {
        this.provideWheelSpeed = z13;
        return this;
    }

    public LocationSettings setSpeed(double d13) {
        this.speed = d13;
        return this;
    }

    public LocationSettings setWheelSpeedTimeInterval(TimeInterval timeInterval) {
        this.wheelSpeedTimeInterval = timeInterval;
        return this;
    }

    public LocationSettings() {
        this.provideAccuracy = false;
        this.accuracy = null;
        this.locationTimeInterval = null;
        this.provideSpeed = false;
        this.speed = 0.0d;
        this.provideHeading = false;
        this.headingError = null;
        this.locationError = null;
        this.provideWheelSpeed = false;
        this.wheelSpeedTimeInterval = null;
    }
}
