package androidx.collection;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class rlfsiqarku {

    public static final class iobyxmoadg extends hg.stevsuqkhv {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ xrmfcynszj f4361yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f4362zdlpuopuiu;

        iobyxmoadg(xrmfcynszj xrmfcynszjVar) {
            this.f4361yggfygwlhe = xrmfcynszjVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4362zdlpuopuiu < this.f4361yggfygwlhe.ojitshcjhn();
        }

        @Override // hg.stevsuqkhv
        public int iobyxmoadg() {
            xrmfcynszj xrmfcynszjVar = this.f4361yggfygwlhe;
            int i13 = this.f4362zdlpuopuiu;
            this.f4362zdlpuopuiu = i13 + 1;
            return xrmfcynszjVar.gtknphoqwx(i13);
        }
    }

    public static final class zoijcleaow implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ xrmfcynszj f4363yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f4364zdlpuopuiu;

        zoijcleaow(xrmfcynszj xrmfcynszjVar) {
            this.f4363yggfygwlhe = xrmfcynszjVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4364zdlpuopuiu < this.f4363yggfygwlhe.ojitshcjhn();
        }

        @Override // java.util.Iterator
        public Object next() {
            xrmfcynszj xrmfcynszjVar = this.f4363yggfygwlhe;
            int i13 = this.f4364zdlpuopuiu;
            this.f4364zdlpuopuiu = i13 + 1;
            return xrmfcynszjVar.rgvfuqvkyq(i13);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final hg.stevsuqkhv iobyxmoadg(xrmfcynszj xrmfcynszjVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(xrmfcynszjVar, "<this>");
        return new iobyxmoadg(xrmfcynszjVar);
    }

    public static final Iterator zoijcleaow(xrmfcynszj xrmfcynszjVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(xrmfcynszjVar, "<this>");
        return new zoijcleaow(xrmfcynszjVar);
    }
}
