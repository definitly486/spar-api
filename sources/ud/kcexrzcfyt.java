package ud;

import android.util.Log;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f113391ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113392iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f113393zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: ud.kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2811iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            int f113394iwizpuwonk;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f113396yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f113397zdlpuopuiu;

            C2811iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                this.f113396yggfygwlhe = obj;
                this.f113394iwizpuwonk |= Integer.MIN_VALUE;
                return iobyxmoadg.this.iobyxmoadg(null, this);
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [uc.eablkybsjg] */
        /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, uc.eablkybsjg] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        public final Object iobyxmoadg(uc.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            C2811iobyxmoadg c2811iobyxmoadg;
            ?? r13;
            String str;
            ?? r14;
            if (gxszxtbevoVar instanceof C2811iobyxmoadg) {
                c2811iobyxmoadg = (C2811iobyxmoadg) gxszxtbevoVar;
                int i13 = c2811iobyxmoadg.f113394iwizpuwonk;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c2811iobyxmoadg.f113394iwizpuwonk = i13 - Integer.MIN_VALUE;
                } else {
                    c2811iobyxmoadg = new C2811iobyxmoadg(gxszxtbevoVar);
                }
            } else {
                c2811iobyxmoadg = new C2811iobyxmoadg(gxszxtbevoVar);
            }
            Object objIobyxmoadg = c2811iobyxmoadg.f113396yggfygwlhe;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = c2811iobyxmoadg.f113394iwizpuwonk;
            String str2 = "";
            try {
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            uc.eablkybsjg eablkybsjgVar2 = (uc.eablkybsjg) c2811iobyxmoadg.f113397zdlpuopuiu;
                            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                            eablkybsjgVar = eablkybsjgVar2;
                        } else {
                            if (i14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str3 = (String) c2811iobyxmoadg.f113397zdlpuopuiu;
                            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                            eablkybsjgVar = str3;
                        }
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objIobyxmoadg, "{\n          firebaseInst…ions.id.await()\n        }");
                        str2 = (String) objIobyxmoadg;
                        r14 = eablkybsjgVar;
                        return new kcexrzcfyt(str2, r14, null);
                    }
                    gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                    Task taskIobyxmoadg = eablkybsjgVar.iobyxmoadg(false);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(taskIobyxmoadg, "firebaseInstallations.getToken(false)");
                    c2811iobyxmoadg.f113397zdlpuopuiu = eablkybsjgVar;
                    c2811iobyxmoadg.f113394iwizpuwonk = 1;
                    objIobyxmoadg = zj.zoijcleaow.iobyxmoadg(taskIobyxmoadg, c2811iobyxmoadg);
                    eablkybsjgVar = eablkybsjgVar;
                    if (objIobyxmoadg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    String strZoijcleaow = ((com.google.firebase.installations.gxszxtbevo) objIobyxmoadg).zoijcleaow();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "{\n          firebaseInst…).await().token\n        }");
                    r13 = eablkybsjgVar;
                    str = strZoijcleaow;
                } catch (Exception e13) {
                    Log.w("InstallationId", "Error getting authentication token.", e13);
                    r13 = eablkybsjgVar;
                    str = "";
                }
                Task id2 = r13.getId();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(id2, "firebaseInstallations.id");
                c2811iobyxmoadg.f113397zdlpuopuiu = str;
                c2811iobyxmoadg.f113394iwizpuwonk = 2;
                objIobyxmoadg = zj.zoijcleaow.iobyxmoadg(id2, c2811iobyxmoadg);
                eablkybsjgVar = str;
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objIobyxmoadg, "{\n          firebaseInst…ions.id.await()\n        }");
                str2 = (String) objIobyxmoadg;
                r14 = eablkybsjgVar;
            } catch (Exception e14) {
                Log.w("InstallationId", "Error getting Firebase installation id .", e14);
                r14 = eablkybsjgVar;
            }
            return new kcexrzcfyt(str2, r14, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ kcexrzcfyt(String str, String str2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, str2);
    }

    public final String iobyxmoadg() {
        return this.f113393zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f113392iobyxmoadg;
    }

    private kcexrzcfyt(String str, String str2) {
        this.f113392iobyxmoadg = str;
        this.f113393zoijcleaow = str2;
    }
}
