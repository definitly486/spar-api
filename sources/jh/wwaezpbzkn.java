package jh;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wwaezpbzkn extends bfopjjpdmp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f51345iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f51346zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwaezpbzkn(List underlyingPropertyNamesToTypes) {
        super(null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f51345iobyxmoadg = underlyingPropertyNamesToTypes;
        Map mapKcexrzcfyt = hg.tzroggbefp.kcexrzcfyt(ppxfxbqfkf());
        if (mapKcexrzcfyt.size() != ppxfxbqfkf().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f51346zoijcleaow = mapKcexrzcfyt;
    }

    @Override // jh.bfopjjpdmp
    public boolean iobyxmoadg(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return this.f51346zoijcleaow.containsKey(name);
    }

    public List ppxfxbqfkf() {
        return this.f51345iobyxmoadg;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + ppxfxbqfkf() + ')';
    }
}
