package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface istkbnxepw {
    Map forMapData(Object obj);

    pmvmpeiblj.iobyxmoadg forMapMetadata(Object obj);

    Map forMutableMapData(Object obj);

    int getSerializedSize(int i13, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
