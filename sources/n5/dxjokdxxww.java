package n5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww extends lereixgezr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(oxmwwwfdhm database) {
        super(database);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(database, "database");
    }

    public final int btonecajqb(Object obj) {
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow();
        try {
            dxjokdxxww(gtknphoqwxVarZoijcleaow, obj);
            return gtknphoqwxVarZoijcleaow.pkzmftpjix();
        } finally {
            nufgyqmvbu(gtknphoqwxVarZoijcleaow);
        }
    }

    protected abstract void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, Object obj);

    public final int gtknphoqwx(Iterable entities) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entities, "entities");
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow();
        try {
            Iterator it = entities.iterator();
            int iPkzmftpjix = 0;
            while (it.hasNext()) {
                dxjokdxxww(gtknphoqwxVarZoijcleaow, it.next());
                iPkzmftpjix += gtknphoqwxVarZoijcleaow.pkzmftpjix();
            }
            nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            return iPkzmftpjix;
        } catch (Throwable th2) {
            nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th2;
        }
    }
}
