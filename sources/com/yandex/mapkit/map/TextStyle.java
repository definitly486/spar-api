package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TextStyle implements Serializable {
    private int color;
    private float offset;
    private boolean offsetFromIcon;
    private int outlineColor;
    private float outlineWidth;
    private Placement placement;
    private float size;
    private boolean textOptional;

    public enum Placement {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public TextStyle(float f13, int i13, float f14, int i14, Placement placement, float f15, boolean z13, boolean z14) {
        this.size = 8.0f;
        this.color = -16777216;
        this.outlineWidth = 1.0f;
        this.outlineColor = -1;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.size = f13;
        this.color = i13;
        this.outlineWidth = f14;
        this.outlineColor = i14;
        this.placement = placement;
        this.offset = f15;
        this.offsetFromIcon = z13;
        this.textOptional = z14;
    }

    public int getColor() {
        return this.color;
    }

    public float getOffset() {
        return this.offset;
    }

    public boolean getOffsetFromIcon() {
        return this.offsetFromIcon;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public Placement getPlacement() {
        return this.placement;
    }

    public float getSize() {
        return this.size;
    }

    public boolean getTextOptional() {
        return this.textOptional;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.size = archive.add(this.size);
        this.color = archive.add(this.color);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.outlineColor = archive.add(this.outlineColor);
        this.placement = (Placement) archive.add(this.placement, false, (Class<Placement>) Placement.class);
        this.offset = archive.add(this.offset);
        this.offsetFromIcon = archive.add(this.offsetFromIcon);
        this.textOptional = archive.add(this.textOptional);
    }

    public TextStyle setColor(int i13) {
        this.color = i13;
        return this;
    }

    public TextStyle setOffset(float f13) {
        this.offset = f13;
        return this;
    }

    public TextStyle setOffsetFromIcon(boolean z13) {
        this.offsetFromIcon = z13;
        return this;
    }

    public TextStyle setOutlineColor(int i13) {
        this.outlineColor = i13;
        return this;
    }

    public TextStyle setOutlineWidth(float f13) {
        this.outlineWidth = f13;
        return this;
    }

    public TextStyle setPlacement(Placement placement) {
        if (placement == null) {
            throw new IllegalArgumentException("Required field \"placement\" cannot be null");
        }
        this.placement = placement;
        return this;
    }

    public TextStyle setSize(float f13) {
        this.size = f13;
        return this;
    }

    public TextStyle setTextOptional(boolean z13) {
        this.textOptional = z13;
        return this;
    }

    public TextStyle() {
        this.size = 8.0f;
        this.color = -16777216;
        this.outlineWidth = 1.0f;
        this.outlineColor = -1;
        this.placement = Placement.CENTER;
        this.offset = 0.0f;
        this.offsetFromIcon = true;
        this.textOptional = false;
    }
}
