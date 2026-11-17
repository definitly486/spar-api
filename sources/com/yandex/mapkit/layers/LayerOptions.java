package com.yandex.mapkit.layers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LayerOptions implements Serializable {
    private boolean active;
    private boolean animateOnActivation;
    private boolean cacheable;
    private boolean nightModeAvailable;
    private OverzoomMode overzoomMode;
    private long tileAppearingAnimationDuration;
    private boolean transparent;
    private boolean versionSupport;

    public LayerOptions(boolean z13, boolean z14, boolean z15, boolean z16, long j13, OverzoomMode overzoomMode, boolean z17, boolean z18) {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.active = z13;
        this.nightModeAvailable = z14;
        this.cacheable = z15;
        this.animateOnActivation = z16;
        this.tileAppearingAnimationDuration = j13;
        this.overzoomMode = overzoomMode;
        this.transparent = z17;
        this.versionSupport = z18;
    }

    public boolean getActive() {
        return this.active;
    }

    public boolean getAnimateOnActivation() {
        return this.animateOnActivation;
    }

    public boolean getCacheable() {
        return this.cacheable;
    }

    public boolean getNightModeAvailable() {
        return this.nightModeAvailable;
    }

    public OverzoomMode getOverzoomMode() {
        return this.overzoomMode;
    }

    public long getTileAppearingAnimationDuration() {
        return this.tileAppearingAnimationDuration;
    }

    public boolean getTransparent() {
        return this.transparent;
    }

    public boolean getVersionSupport() {
        return this.versionSupport;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.active = archive.add(this.active);
        this.nightModeAvailable = archive.add(this.nightModeAvailable);
        this.cacheable = archive.add(this.cacheable);
        this.animateOnActivation = archive.add(this.animateOnActivation);
        this.tileAppearingAnimationDuration = archive.add(this.tileAppearingAnimationDuration);
        this.overzoomMode = (OverzoomMode) archive.add(this.overzoomMode, false, (Class<OverzoomMode>) OverzoomMode.class);
        this.transparent = archive.add(this.transparent);
        this.versionSupport = archive.add(this.versionSupport);
    }

    public LayerOptions setActive(boolean z13) {
        this.active = z13;
        return this;
    }

    public LayerOptions setAnimateOnActivation(boolean z13) {
        this.animateOnActivation = z13;
        return this;
    }

    public LayerOptions setCacheable(boolean z13) {
        this.cacheable = z13;
        return this;
    }

    public LayerOptions setNightModeAvailable(boolean z13) {
        this.nightModeAvailable = z13;
        return this;
    }

    public LayerOptions setOverzoomMode(OverzoomMode overzoomMode) {
        if (overzoomMode == null) {
            throw new IllegalArgumentException("Required field \"overzoomMode\" cannot be null");
        }
        this.overzoomMode = overzoomMode;
        return this;
    }

    public LayerOptions setTileAppearingAnimationDuration(long j13) {
        this.tileAppearingAnimationDuration = j13;
        return this;
    }

    public LayerOptions setTransparent(boolean z13) {
        this.transparent = z13;
        return this;
    }

    public LayerOptions setVersionSupport(boolean z13) {
        this.versionSupport = z13;
        return this;
    }

    public LayerOptions() {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.versionSupport = true;
    }
}
