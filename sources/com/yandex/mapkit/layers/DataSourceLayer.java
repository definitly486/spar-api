package com.yandex.mapkit.layers;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSourceLayer {
    void clear();

    boolean isActive();

    boolean isValid();

    void remove();

    void resetStyles();

    void setActive(boolean z13);

    void setDataSourceListener(DataSourceListener dataSourceListener);

    void setLayerLoadedListener(LayerLoadedListener layerLoadedListener);

    boolean setStyle(int i13, String str);
}
