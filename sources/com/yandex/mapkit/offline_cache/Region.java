package com.yandex.mapkit.offline_cache;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Region implements Serializable {
    private Point center;
    private String country;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f25452id;
    private String name;
    private Integer parentId;
    private long releaseTime;
    private LocalizedValue size;

    public Region(int i13, String str, String str2, Point point, LocalizedValue localizedValue, long j13, Integer num) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"name\" cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required field \"country\" cannot be null");
        }
        if (point == null) {
            throw new IllegalArgumentException("Required field \"center\" cannot be null");
        }
        if (localizedValue == null) {
            throw new IllegalArgumentException("Required field \"size\" cannot be null");
        }
        this.f25452id = i13;
        this.name = str;
        this.country = str2;
        this.center = point;
        this.size = localizedValue;
        this.releaseTime = j13;
        this.parentId = num;
    }

    public Point getCenter() {
        return this.center;
    }

    public String getCountry() {
        return this.country;
    }

    public int getId() {
        return this.f25452id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public long getReleaseTime() {
        return this.releaseTime;
    }

    public LocalizedValue getSize() {
        return this.size;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f25452id = archive.add(this.f25452id);
        this.name = archive.add(this.name, false);
        this.country = archive.add(this.country, false);
        this.center = (Point) archive.add(this.center, false, (Class<Point>) Point.class);
        this.size = (LocalizedValue) archive.add(this.size, false, (Class<LocalizedValue>) LocalizedValue.class);
        this.releaseTime = archive.add(this.releaseTime);
        this.parentId = archive.add(this.parentId, true);
    }

    public Region() {
    }
}
