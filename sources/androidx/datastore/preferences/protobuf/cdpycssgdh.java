package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class cdpycssgdh implements istkbnxepw {
    cdpycssgdh() {
    }

    private static int iobyxmoadg(int i13, Object obj, Object obj2) {
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) obj;
        pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) obj2;
        int iIobyxmoadg = 0;
        if (zynmafqrjbVar.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : zynmafqrjbVar.entrySet()) {
            iIobyxmoadg += pmvmpeibljVar.iobyxmoadg(i13, entry.getKey(), entry.getValue());
        }
        return iIobyxmoadg;
    }

    private static zynmafqrjb zoijcleaow(Object obj, Object obj2) {
        zynmafqrjb zynmafqrjbVarJyumaefscl = (zynmafqrjb) obj;
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) obj2;
        if (!zynmafqrjbVar.isEmpty()) {
            if (!zynmafqrjbVarJyumaefscl.vdvldrhtss()) {
                zynmafqrjbVarJyumaefscl = zynmafqrjbVarJyumaefscl.jyumaefscl();
            }
            zynmafqrjbVarJyumaefscl.zdlpuopuiu(zynmafqrjbVar);
        }
        return zynmafqrjbVarJyumaefscl;
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public Map forMapData(Object obj) {
        return (zynmafqrjb) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public pmvmpeiblj.iobyxmoadg forMapMetadata(Object obj) {
        return ((pmvmpeiblj) obj).ppxfxbqfkf();
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public Map forMutableMapData(Object obj) {
        return (zynmafqrjb) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public int getSerializedSize(int i13, Object obj, Object obj2) {
        return iobyxmoadg(i13, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public boolean isImmutable(Object obj) {
        return !((zynmafqrjb) obj).vdvldrhtss();
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public Object mergeFrom(Object obj, Object obj2) {
        return zoijcleaow(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public Object newMapField(Object obj) {
        return zynmafqrjb.draadjrbmk().jyumaefscl();
    }

    @Override // androidx.datastore.preferences.protobuf.istkbnxepw
    public Object toImmutable(Object obj) {
        ((zynmafqrjb) obj).kcexrzcfyt();
        return obj;
    }
}
