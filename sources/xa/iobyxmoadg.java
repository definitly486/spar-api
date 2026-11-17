package xa;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class iobyxmoadg implements Iterator {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f121848yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private EnumC3064iobyxmoadg f121849zdlpuopuiu = EnumC3064iobyxmoadg.NOT_READY;

    /* JADX INFO: renamed from: xa.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private enum EnumC3064iobyxmoadg {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected iobyxmoadg() {
    }

    private boolean ppxfxbqfkf() {
        this.f121849zdlpuopuiu = EnumC3064iobyxmoadg.FAILED;
        this.f121848yggfygwlhe = iobyxmoadg();
        if (this.f121849zdlpuopuiu == EnumC3064iobyxmoadg.DONE) {
            return false;
        }
        this.f121849zdlpuopuiu = EnumC3064iobyxmoadg.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        draadjrbmk.ojitshcjhn(this.f121849zdlpuopuiu != EnumC3064iobyxmoadg.FAILED);
        int iOrdinal = this.f121849zdlpuopuiu.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return ppxfxbqfkf();
        }
        return false;
    }

    protected abstract Object iobyxmoadg();

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f121849zdlpuopuiu = EnumC3064iobyxmoadg.NOT_READY;
        Object objIobyxmoadg = nufgyqmvbu.iobyxmoadg(this.f121848yggfygwlhe);
        this.f121848yggfygwlhe = null;
        return objIobyxmoadg;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected final Object zoijcleaow() {
        this.f121849zdlpuopuiu = EnumC3064iobyxmoadg.DONE;
        return null;
    }
}
