package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
class ppxfxbqfkf extends wflxmlrfwp {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f60163cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f60164iwizpuwonk;

    private class zoijcleaow implements wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f60166yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f60167zdlpuopuiu;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60167zdlpuopuiu < this.f60166yggfygwlhe;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc.iobyxmoadg
        public byte nextByte() {
            int i13 = this.f60167zdlpuopuiu;
            if (i13 >= this.f60166yggfygwlhe) {
                throw new NoSuchElementException();
            }
            byte[] bArr = ppxfxbqfkf.this.f60169yggfygwlhe;
            this.f60167zdlpuopuiu = i13 + 1;
            return bArr[i13];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private zoijcleaow() {
            int iCqumvgiudr = ppxfxbqfkf.this.cqumvgiudr();
            this.f60167zdlpuopuiu = iCqumvgiudr;
            this.f60166yggfygwlhe = iCqumvgiudr + ppxfxbqfkf.this.size();
        }
    }

    ppxfxbqfkf(byte[] bArr, int i13, int i14) {
        super(bArr);
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Offset too small: ");
            sb3.append(i13);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i14 < 0) {
            StringBuilder sb4 = new StringBuilder(29);
            sb4.append("Length too small: ");
            sb4.append(i13);
            throw new IllegalArgumentException(sb4.toString());
        }
        if (((long) i13) + ((long) i14) <= bArr.length) {
            this.f60164iwizpuwonk = i13;
            this.f60163cqumvgiudr = i14;
            return;
        }
        StringBuilder sb5 = new StringBuilder(48);
        sb5.append("Offset+Length too large: ");
        sb5.append(i13);
        sb5.append("+");
        sb5.append(i14);
        throw new IllegalArgumentException(sb5.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wflxmlrfwp, kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    protected void btonecajqb(byte[] bArr, int i13, int i14, int i15) {
        System.arraycopy(this.f60169yggfygwlhe, cqumvgiudr() + i13, bArr, i14, i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wflxmlrfwp
    protected int cqumvgiudr() {
        return this.f60164iwizpuwonk;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wflxmlrfwp, java.lang.Iterable
    /* JADX INFO: renamed from: lereixgezr */
    public wkgbmnqykc.iobyxmoadg iterator() {
        return new zoijcleaow();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.wflxmlrfwp, kotlin.reflect.jvm.internal.impl.protobuf.wkgbmnqykc
    public int size() {
        return this.f60163cqumvgiudr;
    }
}
