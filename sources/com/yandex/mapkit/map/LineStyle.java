package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LineStyle implements Serializable {
    private float arcApproximationStep;
    private float dashLength;
    private float dashOffset;
    private float gapLength;
    private float gradientLength;
    private boolean innerOutlineEnabled;
    private int outlineColor;
    private float outlineWidth;
    private float strokeWidth;
    private float turnRadius;

    public LineStyle(float f13, float f14, int i13, float f15, boolean z13, float f16, float f17, float f18, float f19, float f23) {
        this.strokeWidth = f13;
        this.gradientLength = f14;
        this.outlineColor = i13;
        this.outlineWidth = f15;
        this.innerOutlineEnabled = z13;
        this.turnRadius = f16;
        this.arcApproximationStep = f17;
        this.dashLength = f18;
        this.gapLength = f19;
        this.dashOffset = f23;
    }

    public float getArcApproximationStep() {
        return this.arcApproximationStep;
    }

    public float getDashLength() {
        return this.dashLength;
    }

    public float getDashOffset() {
        return this.dashOffset;
    }

    public float getGapLength() {
        return this.gapLength;
    }

    public float getGradientLength() {
        return this.gradientLength;
    }

    public boolean getInnerOutlineEnabled() {
        return this.innerOutlineEnabled;
    }

    public int getOutlineColor() {
        return this.outlineColor;
    }

    public float getOutlineWidth() {
        return this.outlineWidth;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getTurnRadius() {
        return this.turnRadius;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.strokeWidth = archive.add(this.strokeWidth);
        this.gradientLength = archive.add(this.gradientLength);
        this.outlineColor = archive.add(this.outlineColor);
        this.outlineWidth = archive.add(this.outlineWidth);
        this.innerOutlineEnabled = archive.add(this.innerOutlineEnabled);
        this.turnRadius = archive.add(this.turnRadius);
        this.arcApproximationStep = archive.add(this.arcApproximationStep);
        this.dashLength = archive.add(this.dashLength);
        this.gapLength = archive.add(this.gapLength);
        this.dashOffset = archive.add(this.dashOffset);
    }

    public LineStyle setArcApproximationStep(float f13) {
        this.arcApproximationStep = f13;
        return this;
    }

    public LineStyle setDashLength(float f13) {
        this.dashLength = f13;
        return this;
    }

    public LineStyle setDashOffset(float f13) {
        this.dashOffset = f13;
        return this;
    }

    public LineStyle setGapLength(float f13) {
        this.gapLength = f13;
        return this;
    }

    public LineStyle setGradientLength(float f13) {
        this.gradientLength = f13;
        return this;
    }

    public LineStyle setInnerOutlineEnabled(boolean z13) {
        this.innerOutlineEnabled = z13;
        return this;
    }

    public LineStyle setOutlineColor(int i13) {
        this.outlineColor = i13;
        return this;
    }

    public LineStyle setOutlineWidth(float f13) {
        this.outlineWidth = f13;
        return this;
    }

    public LineStyle setStrokeWidth(float f13) {
        this.strokeWidth = f13;
        return this;
    }

    public LineStyle setTurnRadius(float f13) {
        this.turnRadius = f13;
        return this;
    }

    public LineStyle() {
        this.strokeWidth = 5.0f;
        this.gradientLength = 0.0f;
        this.outlineColor = 0;
        this.outlineWidth = 0.0f;
        this.innerOutlineEnabled = false;
        this.turnRadius = 10.0f;
        this.arcApproximationStep = 12.0f;
        this.dashLength = 0.0f;
        this.gapLength = 0.0f;
        this.dashOffset = 0.0f;
    }
}
