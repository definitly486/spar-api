package gj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final dxjokdxxww f37542zdlpuopuiu = new dxjokdxxww();

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private dxjokdxxww() {
        super(null);
    }

    @Override // gj.ppxfxbqfkf
    public int iobyxmoadg() {
        return 0;
    }

    @Override // gj.ppxfxbqfkf, java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    @Override // gj.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Void get(int i13) {
        return null;
    }

    @Override // gj.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public void zoijcleaow(int i13, Void value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        throw new IllegalStateException();
    }
}
