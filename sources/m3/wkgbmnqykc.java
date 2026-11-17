package m3;

import androidx.media3.exoplayer.source.lmojexxdyd;
import androidx.media3.exoplayer.uwvvkdfqfp;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements lmojexxdyd {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f65055yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.common.collect.zdlpuopuiu f65056zdlpuopuiu;

    private static final class iobyxmoadg implements lmojexxdyd {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final com.google.common.collect.zdlpuopuiu f65057yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lmojexxdyd f65058zdlpuopuiu;

        public iobyxmoadg(lmojexxdyd lmojexxdydVar, List list) {
            this.f65058zdlpuopuiu = lmojexxdydVar;
            this.f65057yggfygwlhe = com.google.common.collect.zdlpuopuiu.jyumaefscl(list);
        }

        @Override // androidx.media3.exoplayer.source.lmojexxdyd
        public void eablkybsjg(long j13) {
            this.f65058zdlpuopuiu.eablkybsjg(j13);
        }

        public com.google.common.collect.zdlpuopuiu gxszxtbevo() {
            return this.f65057yggfygwlhe;
        }

        @Override // androidx.media3.exoplayer.source.lmojexxdyd
        public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
            return this.f65058zdlpuopuiu.iobyxmoadg(uwvvkdfqfpVar);
        }

        @Override // androidx.media3.exoplayer.source.lmojexxdyd
        public boolean ppxfxbqfkf() {
            return this.f65058zdlpuopuiu.ppxfxbqfkf();
        }

        @Override // androidx.media3.exoplayer.source.lmojexxdyd
        public long wkgbmnqykc() {
            return this.f65058zdlpuopuiu.wkgbmnqykc();
        }

        @Override // androidx.media3.exoplayer.source.lmojexxdyd
        public long zoijcleaow() {
            return this.f65058zdlpuopuiu.zoijcleaow();
        }
    }

    public wkgbmnqykc(List list, List list2) {
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
        y2.iobyxmoadg.iobyxmoadg(list.size() == list2.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new iobyxmoadg((lmojexxdyd) list.get(i13), (List) list2.get(i13)));
        }
        this.f65056zdlpuopuiu = iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        this.f65055yggfygwlhe = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
        for (int i13 = 0; i13 < this.f65056zdlpuopuiu.size(); i13++) {
            ((iobyxmoadg) this.f65056zdlpuopuiu.get(i13)).eablkybsjg(j13);
        }
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        boolean zIobyxmoadg;
        boolean z13 = false;
        do {
            long jZoijcleaow = zoijcleaow();
            if (jZoijcleaow == Long.MIN_VALUE) {
                break;
            }
            zIobyxmoadg = false;
            for (int i13 = 0; i13 < this.f65056zdlpuopuiu.size(); i13++) {
                long jZoijcleaow2 = ((iobyxmoadg) this.f65056zdlpuopuiu.get(i13)).zoijcleaow();
                boolean z14 = jZoijcleaow2 != Long.MIN_VALUE && jZoijcleaow2 <= uwvvkdfqfpVar.f11446iobyxmoadg;
                if (jZoijcleaow2 == jZoijcleaow || z14) {
                    zIobyxmoadg |= ((iobyxmoadg) this.f65056zdlpuopuiu.get(i13)).iobyxmoadg(uwvvkdfqfpVar);
                }
            }
            z13 |= zIobyxmoadg;
        } while (zIobyxmoadg);
        return z13;
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        for (int i13 = 0; i13 < this.f65056zdlpuopuiu.size(); i13++) {
            if (((iobyxmoadg) this.f65056zdlpuopuiu.get(i13)).ppxfxbqfkf()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i13 = 0; i13 < this.f65056zdlpuopuiu.size(); i13++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f65056zdlpuopuiu.get(i13);
            long jWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
            if ((iobyxmoadgVar.gxszxtbevo().contains(1) || iobyxmoadgVar.gxszxtbevo().contains(2) || iobyxmoadgVar.gxszxtbevo().contains(4)) && jWkgbmnqykc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jWkgbmnqykc);
            }
            if (jWkgbmnqykc != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jWkgbmnqykc);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f65055yggfygwlhe = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j13 = this.f65055yggfygwlhe;
        return j13 != -9223372036854775807L ? j13 : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        long jMin = Long.MAX_VALUE;
        for (int i13 = 0; i13 < this.f65056zdlpuopuiu.size(); i13++) {
            long jZoijcleaow = ((iobyxmoadg) this.f65056zdlpuopuiu.get(i13)).zoijcleaow();
            if (jZoijcleaow != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZoijcleaow);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
