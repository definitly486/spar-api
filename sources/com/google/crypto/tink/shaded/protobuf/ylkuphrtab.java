package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ylkuphrtab implements wwaezpbzkn {
    ylkuphrtab() {
    }

    private static int iobyxmoadg(int i13, Object obj, Object obj2) {
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj2);
        if (lmojexxdydVar.isEmpty()) {
            return 0;
        }
        Iterator it = lmojexxdydVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static lmojexxdyd zoijcleaow(Object obj, Object obj2) {
        lmojexxdyd lmojexxdydVarJyumaefscl = (lmojexxdyd) obj;
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj2;
        if (!lmojexxdydVar.isEmpty()) {
            if (!lmojexxdydVarJyumaefscl.vdvldrhtss()) {
                lmojexxdydVarJyumaefscl = lmojexxdydVarJyumaefscl.jyumaefscl();
            }
            lmojexxdydVarJyumaefscl.zdlpuopuiu(lmojexxdydVar);
        }
        return lmojexxdydVarJyumaefscl;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public Map forMapData(Object obj) {
        return (lmojexxdyd) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public iozdgvuglv.iobyxmoadg forMapMetadata(Object obj) {
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public Map forMutableMapData(Object obj) {
        return (lmojexxdyd) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public int getSerializedSize(int i13, Object obj, Object obj2) {
        return iobyxmoadg(i13, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public boolean isImmutable(Object obj) {
        return !((lmojexxdyd) obj).vdvldrhtss();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public Object mergeFrom(Object obj, Object obj2) {
        return zoijcleaow(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public Object newMapField(Object obj) {
        return lmojexxdyd.draadjrbmk().jyumaefscl();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.wwaezpbzkn
    public Object toImmutable(Object obj) {
        ((lmojexxdyd) obj).kcexrzcfyt();
        return obj;
    }
}
