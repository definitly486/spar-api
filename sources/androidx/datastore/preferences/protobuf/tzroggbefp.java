package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class tzroggbefp {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final tzroggbefp f8804ppxfxbqfkf = new tzroggbefp();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConcurrentMap f8806zoijcleaow = new ConcurrentHashMap();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final crxdokpmqz f8805iobyxmoadg = new lereixgezr();

    private tzroggbefp() {
    }

    public static tzroggbefp iobyxmoadg() {
        return f8804ppxfxbqfkf;
    }

    public sopmlzcsov ppxfxbqfkf(Class cls) {
        zdlpuopuiu.zoijcleaow(cls, "messageType");
        sopmlzcsov sopmlzcsovVar = (sopmlzcsov) this.f8806zoijcleaow.get(cls);
        if (sopmlzcsovVar != null) {
            return sopmlzcsovVar;
        }
        sopmlzcsov sopmlzcsovVarCreateSchema = this.f8805iobyxmoadg.createSchema(cls);
        sopmlzcsov sopmlzcsovVarZoijcleaow = zoijcleaow(cls, sopmlzcsovVarCreateSchema);
        return sopmlzcsovVarZoijcleaow != null ? sopmlzcsovVarZoijcleaow : sopmlzcsovVarCreateSchema;
    }

    public sopmlzcsov wkgbmnqykc(Object obj) {
        return ppxfxbqfkf(obj.getClass());
    }

    public sopmlzcsov zoijcleaow(Class cls, sopmlzcsov sopmlzcsovVar) {
        zdlpuopuiu.zoijcleaow(cls, "messageType");
        zdlpuopuiu.zoijcleaow(sopmlzcsovVar, "schema");
        return (sopmlzcsov) this.f8806zoijcleaow.putIfAbsent(cls, sopmlzcsovVar);
    }
}
