package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Location implements Serializable {
    private long absoluteTimestamp;
    private Double accuracy;
    private Double altitude;
    private Double altitudeAccuracy;
    private Double heading;
    private String indoorLevelId;
    private Point position;
    private long relativeTimestamp;
    private Double speed;

    public Location(Point point, Double d13, Double d14, Double d15, Double d16, Double d17, String str, long j13, long j14) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = point;
        this.accuracy = d13;
        this.altitude = d14;
        this.altitudeAccuracy = d15;
        this.heading = d16;
        this.speed = d17;
        this.indoorLevelId = str;
        this.absoluteTimestamp = j13;
        this.relativeTimestamp = j14;
    }

    public long getAbsoluteTimestamp() {
        return this.absoluteTimestamp;
    }

    public Double getAccuracy() {
        return this.accuracy;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public Double getHeading() {
        return this.heading;
    }

    public String getIndoorLevelId() {
        return this.indoorLevelId;
    }

    public Point getPosition() {
        return this.position;
    }

    public long getRelativeTimestamp() {
        return this.relativeTimestamp;
    }

    public Double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Point) archive.add(this.position, false, (Class<Point>) Point.class);
        this.accuracy = archive.add(this.accuracy, true);
        this.altitude = archive.add(this.altitude, true);
        this.altitudeAccuracy = archive.add(this.altitudeAccuracy, true);
        this.heading = archive.add(this.heading, true);
        this.speed = archive.add(this.speed, true);
        this.indoorLevelId = archive.add(this.indoorLevelId, true);
        this.absoluteTimestamp = archive.add(this.absoluteTimestamp);
        this.relativeTimestamp = archive.add(this.relativeTimestamp);
    }

    public Location() {
    }
}
