package sj;

import java.util.List;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
final class dsvhmnatus implements jpowsppfya {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f106839ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f106840zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ int f106842jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f106843yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106844zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((nufgyqmvbu) obj, ((Number) obj2).intValue(), (lg.gxszxtbevo) obj3);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:28:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            nufgyqmvbu nufgyqmvbuVar;
            pkzmftpjix pkzmftpjixVar;
            long j13;
            pkzmftpjix pkzmftpjixVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f106844zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        nufgyqmvbuVar = (nufgyqmvbu) this.f106843yggfygwlhe;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        if (dsvhmnatus.this.f106839ppxfxbqfkf > 0) {
                            pkzmftpjixVar = pkzmftpjix.STOP;
                            this.f106843yggfygwlhe = nufgyqmvbuVar;
                            this.f106844zdlpuopuiu = 3;
                            if (nufgyqmvbuVar.emit(pkzmftpjixVar, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            j13 = dsvhmnatus.this.f106839ppxfxbqfkf;
                            this.f106843yggfygwlhe = nufgyqmvbuVar;
                            this.f106844zdlpuopuiu = 4;
                            if (crxdokpmqz.zoijcleaow(j13, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else if (i13 == 3) {
                        nufgyqmvbuVar = (nufgyqmvbu) this.f106843yggfygwlhe;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        j13 = dsvhmnatus.this.f106839ppxfxbqfkf;
                        this.f106843yggfygwlhe = nufgyqmvbuVar;
                        this.f106844zdlpuopuiu = 4;
                        if (crxdokpmqz.zoijcleaow(j13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (i13 == 4) {
                        nufgyqmvbuVar = (nufgyqmvbu) this.f106843yggfygwlhe;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pkzmftpjixVar2 = pkzmftpjix.STOP_AND_RESET_REPLAY_CACHE;
                    this.f106843yggfygwlhe = null;
                    this.f106844zdlpuopuiu = 5;
                    if (nufgyqmvbuVar.emit(pkzmftpjixVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                gg.zdlpuopuiu.zoijcleaow(obj);
                nufgyqmvbuVar = (nufgyqmvbu) this.f106843yggfygwlhe;
                if (this.f106842jyumaefscl > 0) {
                    pkzmftpjix pkzmftpjixVar3 = pkzmftpjix.START;
                    this.f106844zdlpuopuiu = 1;
                    if (nufgyqmvbuVar.emit(pkzmftpjixVar3, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    long j14 = dsvhmnatus.this.f106840zoijcleaow;
                    this.f106843yggfygwlhe = nufgyqmvbuVar;
                    this.f106844zdlpuopuiu = 2;
                    if (crxdokpmqz.zoijcleaow(j14, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    if (dsvhmnatus.this.f106839ppxfxbqfkf > 0) {
                        pkzmftpjixVar = pkzmftpjix.STOP;
                        this.f106843yggfygwlhe = nufgyqmvbuVar;
                        this.f106844zdlpuopuiu = 3;
                        if (nufgyqmvbuVar.emit(pkzmftpjixVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        j13 = dsvhmnatus.this.f106839ppxfxbqfkf;
                        this.f106843yggfygwlhe = nufgyqmvbuVar;
                        this.f106844zdlpuopuiu = 4;
                        if (crxdokpmqz.zoijcleaow(j13, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    pkzmftpjixVar2 = pkzmftpjix.STOP_AND_RESET_REPLAY_CACHE;
                    this.f106843yggfygwlhe = null;
                    this.f106844zdlpuopuiu = 5;
                    if (nufgyqmvbuVar.emit(pkzmftpjixVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object ojitshcjhn(nufgyqmvbu nufgyqmvbuVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = dsvhmnatus.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f106843yggfygwlhe = nufgyqmvbuVar;
            iobyxmoadgVar.f106842jyumaefscl = i13;
            return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f106845yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f106846zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f106845yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f106846zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((pkzmftpjix) this.f106845yggfygwlhe) != pkzmftpjix.START);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(pkzmftpjixVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public dsvhmnatus(long j13, long j14) {
        this.f106840zoijcleaow = j13;
        this.f106839ppxfxbqfkf = j14;
        if (j13 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j13 + " ms) cannot be negative").toString());
        }
        if (j14 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j14 + " ms) cannot be negative").toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof dsvhmnatus) {
            dsvhmnatus dsvhmnatusVar = (dsvhmnatus) obj;
            if (this.f106840zoijcleaow == dsvhmnatusVar.f106840zoijcleaow && this.f106839ppxfxbqfkf == dsvhmnatusVar.f106839ppxfxbqfkf) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f106840zoijcleaow) * 31) + Long.hashCode(this.f106839ppxfxbqfkf);
    }

    @Override // sj.jpowsppfya
    public lqeggnwhkg iobyxmoadg(wypolnanlu wypolnanluVar) {
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.yggfygwlhe(dxjokdxxww.ikoacuggdj(wypolnanluVar, new iobyxmoadg(null)), new zoijcleaow(null)));
    }

    public String toString() {
        List listWkgbmnqykc = hg.jyumaefscl.wkgbmnqykc(2);
        if (this.f106840zoijcleaow > 0) {
            listWkgbmnqykc.add("stopTimeout=" + this.f106840zoijcleaow + "ms");
        }
        if (this.f106839ppxfxbqfkf < Long.MAX_VALUE) {
            listWkgbmnqykc.add("replayExpiration=" + this.f106839ppxfxbqfkf + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + hg.jyumaefscl.iwxlajgraz(hg.jyumaefscl.iobyxmoadg(listWkgbmnqykc), null, null, null, 0, null, null, 63, null) + ')';
    }
}
