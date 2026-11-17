package com.yandex.mapkit.offline_cache;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface OfflineCacheManager {

    public interface ClearListener {
        void onClearCompleted();
    }

    public interface ErrorListener {
        void onError(Error error);

        void onRegionError(Error error, int i13);
    }

    public interface PathGetterListener {
        void onPathReceived(String str);
    }

    public interface PathSetterListener {
        void onPathSet();

        void onPathSetError(Error error);
    }

    public interface SizeListener {
        void onSizeComputed(Long l13);
    }

    void addErrorListener(ErrorListener errorListener);

    void addRegionListUpdatesListener(RegionListUpdatesListener regionListUpdatesListener);

    void addRegionListener(RegionListener regionListener);

    void allowUseCellularNetwork(boolean z13);

    void clear(ClearListener clearListener);

    void computeCacheSize(SizeListener sizeListener);

    void drop(int i13);

    void enableAutoUpdate(boolean z13);

    List<String> getCities(int i13);

    Long getDownloadedReleaseTime(int i13);

    float getProgress(int i13);

    RegionState getState(int i13);

    boolean isLegacyPath(int i13);

    boolean isValid();

    boolean mayBeOutOfAvailableSpace(int i13);

    void moveData(String str, DataMoveListener dataMoveListener);

    void pauseDownload(int i13);

    List<Region> regions();

    void removeErrorListener(ErrorListener errorListener);

    void removeRegionListUpdatesListener(RegionListUpdatesListener regionListUpdatesListener);

    void removeRegionListener(RegionListener regionListener);

    void requestPath(PathGetterListener pathGetterListener);

    void requestRegionsAtPoint(Point point, RegionsAtPointListener regionsAtPointListener);

    void setCachePath(String str, PathSetterListener pathSetterListener);

    void startDownload(int i13);

    void stopDownload(int i13);
}
