package hg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class metgxyhuhe {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        final /* synthetic */ boolean f40248cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f40249cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private /* synthetic */ Object f40250esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ boolean f40251istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f40252iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f40253jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ int f40254lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ int f40255pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f40256yggfygwlhe;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ Iterator f40257zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(int i13, int i14, Iterator it, boolean z13, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f40254lereixgezr = i13;
            this.f40255pmvmpeiblj = i14;
            this.f40257zynmafqrjb = it;
            this.f40251istkbnxepw = z13;
            this.f40248cdpycssgdh = z14;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f40254lereixgezr, this.f40255pmvmpeiblj, this.f40257zynmafqrjb, this.f40251istkbnxepw, this.f40248cdpycssgdh, gxszxtbevoVar);
            iobyxmoadgVar.f40250esjtqupxsv = obj;
            return iobyxmoadgVar;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:54:0x0104  */
        /* JADX WARN: Code duplicated, block: B:55:0x0106  */
        /* JADX WARN: Code duplicated, block: B:58:0x0119 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:80:0x00f3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0100 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0117 -> B:59:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0145 -> B:72:0x0148). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.metgxyhuhe.iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final void iobyxmoadg(int i13, int i14) {
        String str;
        if (i13 <= 0 || i14 <= 0) {
            if (i13 != i14) {
                str = "Both size " + i13 + " and step " + i14 + " must be greater than zero.";
            } else {
                str = "size " + i13 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator zoijcleaow(Iterator iterator, int i13, int i14, boolean z13, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterator, "iterator");
        return !iterator.hasNext() ? ylkuphrtab.f40284zdlpuopuiu : lj.wflxmlrfwp.iobyxmoadg(new iobyxmoadg(i13, i14, iterator, z14, z13, null));
    }
}
