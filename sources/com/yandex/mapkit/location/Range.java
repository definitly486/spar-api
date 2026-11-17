package com.yandex.mapkit.location;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Range implements Serializable {
    private double from;
    private boolean from__is_initialized;
    private NativeObject nativeObject;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    private double f25450to;
    private boolean to__is_initialized;

    public Range() {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
    }

    private native double getFrom__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::Range";
    }

    private native double getTo__Native();

    private native NativeObject init(double d13, double d14);

    public synchronized double getFrom() {
        try {
            if (!this.from__is_initialized) {
                this.from = getFrom__Native();
                this.from__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.from;
    }

    public synchronized double getTo() {
        try {
            if (!this.to__is_initialized) {
                this.f25450to = getTo__Native();
                this.to__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25450to;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getFrom());
            archive.add(getTo());
            return;
        }
        this.from = archive.add(this.from);
        this.from__is_initialized = true;
        double dAdd = archive.add(this.f25450to);
        this.f25450to = dAdd;
        this.to__is_initialized = true;
        this.nativeObject = init(this.from, dAdd);
    }

    public Range(double d13, double d14) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = init(d13, d14);
        this.from = d13;
        this.from__is_initialized = true;
        this.f25450to = d14;
        this.to__is_initialized = true;
    }

    private Range(NativeObject nativeObject) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
