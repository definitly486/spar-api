package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface uwvvkdfqfp {

    public enum iobyxmoadg {
        ASCENDING,
        DESCENDING
    }

    void eablkybsjg(int i13, Object obj, sopmlzcsov sopmlzcsovVar);

    iobyxmoadg fieldOrder();

    void gxszxtbevo(int i13, List list, sopmlzcsov sopmlzcsovVar);

    void iobyxmoadg(int i13, List list, sopmlzcsov sopmlzcsovVar);

    void ppxfxbqfkf(int i13, Object obj, sopmlzcsov sopmlzcsovVar);

    void wkgbmnqykc(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, Map map);

    void writeBool(int i13, boolean z13);

    void writeBoolList(int i13, List list, boolean z13);

    void writeBytesList(int i13, List list);

    void writeDouble(int i13, double d13);

    void writeDoubleList(int i13, List list, boolean z13);

    void writeEndGroup(int i13);

    void writeEnum(int i13, int i14);

    void writeEnumList(int i13, List list, boolean z13);

    void writeFixed32(int i13, int i14);

    void writeFixed32List(int i13, List list, boolean z13);

    void writeFixed64(int i13, long j13);

    void writeFixed64List(int i13, List list, boolean z13);

    void writeFloat(int i13, float f13);

    void writeFloatList(int i13, List list, boolean z13);

    void writeInt32(int i13, int i14);

    void writeInt32List(int i13, List list, boolean z13);

    void writeInt64(int i13, long j13);

    void writeInt64List(int i13, List list, boolean z13);

    void writeMessageSetItem(int i13, Object obj);

    void writeSFixed32(int i13, int i14);

    void writeSFixed32List(int i13, List list, boolean z13);

    void writeSFixed64(int i13, long j13);

    void writeSFixed64List(int i13, List list, boolean z13);

    void writeSInt32(int i13, int i14);

    void writeSInt32List(int i13, List list, boolean z13);

    void writeSInt64(int i13, long j13);

    void writeSInt64List(int i13, List list, boolean z13);

    void writeStartGroup(int i13);

    void writeString(int i13, String str);

    void writeStringList(int i13, List list);

    void writeUInt32(int i13, int i14);

    void writeUInt32List(int i13, List list, boolean z13);

    void writeUInt64(int i13, long j13);

    void writeUInt64List(int i13, List list, boolean z13);

    void zoijcleaow(int i13, gxszxtbevo gxszxtbevoVar);
}
