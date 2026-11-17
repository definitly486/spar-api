package n5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb extends lereixgezr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(oxmwwwfdhm database) {
        super(database);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(database, "database");
    }

    public final void btonecajqb(Iterable entities) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entities, "entities");
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow();
        try {
            Iterator it = entities.iterator();
            while (it.hasNext()) {
                dxjokdxxww(gtknphoqwxVarZoijcleaow, it.next());
                gtknphoqwxVarZoijcleaow.jrbgnlbqoe();
            }
            nufgyqmvbu(gtknphoqwxVarZoijcleaow);
        } catch (Throwable th2) {
            nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th2;
        }
    }

    protected abstract void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, Object obj);

    public final void gtknphoqwx(Object obj) {
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow();
        try {
            dxjokdxxww(gtknphoqwxVarZoijcleaow, obj);
            gtknphoqwxVarZoijcleaow.jrbgnlbqoe();
        } finally {
            nufgyqmvbu(gtknphoqwxVarZoijcleaow);
        }
    }
}
