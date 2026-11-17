package com.yandex.mapkit.location;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TimeInterval implements Serializable {
    private long from;
    private boolean from__is_initialized;
    private NativeObject nativeObject;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    private long f25451to;
    private boolean to__is_initialized;

    public TimeInterval() {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
    }

    private native long getFrom__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::location::TimeInterval";
    }

    private native long getTo__Native();

    private native NativeObject init(long j13, long j14);

    public synchronized long getFrom() {
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

    public synchronized long getTo() {
        try {
            if (!this.to__is_initialized) {
                this.f25451to = getTo__Native();
                this.to__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25451to;
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
        long jAdd = archive.add(this.f25451to);
        this.f25451to = jAdd;
        this.to__is_initialized = true;
        this.nativeObject = init(this.from, jAdd);
    }

    public TimeInterval(long j13, long j14) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = init(j13, j14);
        this.from = j13;
        this.from__is_initialized = true;
        this.f25451to = j14;
        this.to__is_initialized = true;
    }

    private TimeInterval(NativeObject nativeObject) {
        this.from__is_initialized = false;
        this.to__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
