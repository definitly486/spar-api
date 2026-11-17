package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class crxdokpmqz {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final crxdokpmqz f23892ppxfxbqfkf = new crxdokpmqz();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConcurrentMap f23894zoijcleaow = new ConcurrentHashMap();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ikoacuggdj f23893iobyxmoadg = new yadqdtsiqt();

    private crxdokpmqz() {
    }

    public static crxdokpmqz iobyxmoadg() {
        return f23892ppxfxbqfkf;
    }

    public jhduphickx ppxfxbqfkf(Class cls) {
        esjtqupxsv.zoijcleaow(cls, "messageType");
        jhduphickx jhduphickxVar = (jhduphickx) this.f23894zoijcleaow.get(cls);
        if (jhduphickxVar != null) {
            return jhduphickxVar;
        }
        jhduphickx jhduphickxVarCreateSchema = this.f23893iobyxmoadg.createSchema(cls);
        jhduphickx jhduphickxVarZoijcleaow = zoijcleaow(cls, jhduphickxVarCreateSchema);
        return jhduphickxVarZoijcleaow != null ? jhduphickxVarZoijcleaow : jhduphickxVarCreateSchema;
    }

    public jhduphickx wkgbmnqykc(Object obj) {
        return ppxfxbqfkf(obj.getClass());
    }

    public jhduphickx zoijcleaow(Class cls, jhduphickx jhduphickxVar) {
        esjtqupxsv.zoijcleaow(cls, "messageType");
        esjtqupxsv.zoijcleaow(jhduphickxVar, "schema");
        return (jhduphickx) this.f23894zoijcleaow.putIfAbsent(cls, jhduphickxVar);
    }
}
