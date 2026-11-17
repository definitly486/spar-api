package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface PolylineMapObject extends MapObject {
    Arrow addArrow(PolylinePosition polylinePosition, float f13, int i13);

    List<Arrow> arrows();

    @Deprecated
    float getArcApproximationStep();

    @Deprecated
    float getDashLength();

    @Deprecated
    float getDashOffset();

    @Deprecated
    float getGapLength();

    Polyline getGeometry();

    @Deprecated
    float getGradientLength();

    @Deprecated
    int getOutlineColor();

    @Deprecated
    float getOutlineWidth();

    int getPaletteColor(int i13);

    int getStrokeColor(int i13);

    @Deprecated
    float getStrokeWidth();

    LineStyle getStyle();

    @Deprecated
    float getTurnRadius();

    void hide(Subpolyline subpolyline);

    void hide(List<Subpolyline> list);

    @Deprecated
    boolean isInnerOutlineEnabled();

    void select(int i13, Subpolyline subpolyline);

    @Deprecated
    void setArcApproximationStep(float f13);

    @Deprecated
    void setDashLength(float f13);

    @Deprecated
    void setDashOffset(float f13);

    @Deprecated
    void setGapLength(float f13);

    void setGeometry(Polyline polyline);

    @Deprecated
    void setGradientLength(float f13);

    @Deprecated
    void setInnerOutlineEnabled(boolean z13);

    @Deprecated
    void setOutlineColor(int i13);

    @Deprecated
    void setOutlineWidth(float f13);

    void setPaletteColor(int i13, int i14);

    void setStrokeColor(int i13);

    void setStrokeColors(List<Integer> list);

    void setStrokeColors(List<Integer> list, List<Double> list2);

    @Deprecated
    void setStrokeWidth(float f13);

    void setStyle(LineStyle lineStyle);

    @Deprecated
    void setTurnRadius(float f13);
}
