package kh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq implements nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.draadjrbmk f55481jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f55482yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final nufgyqmvbu f55483zdlpuopuiu;

    public rgvfuqvkyq(nufgyqmvbu delegate, boolean z13, tg.draadjrbmk fqNameFilter) {
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        zdlpuopuiu.btonecajqb(fqNameFilter, "fqNameFilter");
        this.f55483zdlpuopuiu = delegate;
        this.f55482yggfygwlhe = z13;
        this.f55481jyumaefscl = fqNameFilter;
    }

    private final boolean iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        ii.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
        return ppxfxbqfkfVarGxszxtbevo != null && ((Boolean) this.f55481jyumaefscl.invoke(ppxfxbqfkfVarGxszxtbevo)).booleanValue();
    }

    @Override // kh.nufgyqmvbu
    public boolean isEmpty() {
        boolean z13;
        nufgyqmvbu nufgyqmvbuVar = this.f55483zdlpuopuiu;
        if (!(nufgyqmvbuVar instanceof Collection) || !((Collection) nufgyqmvbuVar).isEmpty()) {
            Iterator it = nufgyqmvbuVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z13 = false;
                    break;
                }
                if (iobyxmoadg((ppxfxbqfkf) it.next())) {
                    z13 = true;
                    break;
                }
            }
        } else {
            z13 = false;
            break;
        }
        if (this.f55482yggfygwlhe) {
            return !z13;
        }
        return z13;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        nufgyqmvbu nufgyqmvbuVar = this.f55483zdlpuopuiu;
        ArrayList arrayList = new ArrayList();
        for (Object obj : nufgyqmvbuVar) {
            if (iobyxmoadg((ppxfxbqfkf) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // kh.nufgyqmvbu
    public ppxfxbqfkf lqeggnwhkg(ii.ppxfxbqfkf fqName) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        if (((Boolean) this.f55481jyumaefscl.invoke(fqName)).booleanValue()) {
            return this.f55483zdlpuopuiu.lqeggnwhkg(fqName);
        }
        return null;
    }

    @Override // kh.nufgyqmvbu
    public boolean wizcaqwiak(ii.ppxfxbqfkf fqName) {
        zdlpuopuiu.btonecajqb(fqName, "fqName");
        if (((Boolean) this.f55481jyumaefscl.invoke(fqName)).booleanValue()) {
            return this.f55483zdlpuopuiu.wizcaqwiak(fqName);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(nufgyqmvbu delegate, tg.draadjrbmk fqNameFilter) {
        this(delegate, false, fqNameFilter);
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        zdlpuopuiu.btonecajqb(fqNameFilter, "fqNameFilter");
    }
}
