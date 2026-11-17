package bi0;

import android.content.Context;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.mbcevpiqjq;
import lg.gxszxtbevo;
import ru.myspar.networkpanel.impl.domain.model.NetworkPayload;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements fi0.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C0295iobyxmoadg f16368ppxfxbqfkf = new C0295iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f16369wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f16370iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f16371zoijcleaow;

    /* JADX INFO: renamed from: bi0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0295iobyxmoadg {
        public /* synthetic */ C0295iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0295iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f16372zdlpuopuiu;

        /* JADX INFO: renamed from: bi0.iobyxmoadg$ppxfxbqfkf$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0296iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f16373zdlpuopuiu;

            /* JADX INFO: renamed from: bi0.iobyxmoadg$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0297iobyxmoadg extends wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f16375yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f16376zdlpuopuiu;

                public C0297iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f16376zdlpuopuiu = obj;
                    this.f16375yggfygwlhe |= Integer.MIN_VALUE;
                    return C0296iobyxmoadg.this.emit(null, this);
                }
            }

            public C0296iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f16373zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C0297iobyxmoadg c0297iobyxmoadg;
                if (gxszxtbevoVar instanceof C0297iobyxmoadg) {
                    c0297iobyxmoadg = (C0297iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0297iobyxmoadg.f16375yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0297iobyxmoadg.f16375yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0297iobyxmoadg = new C0297iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0297iobyxmoadg = new C0297iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0297iobyxmoadg.f16376zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0297iobyxmoadg.f16375yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f16373zdlpuopuiu;
                    Collection collectionValues = ((Map) obj).values();
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(collectionValues, 10));
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        arrayList.add(di0.zoijcleaow.iobyxmoadg((di0.iobyxmoadg) it.next()));
                    }
                    c0297iobyxmoadg.f16375yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(arrayList, c0297iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
            this.f16372zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f16372zdlpuopuiu.collect(new C0296iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f16377iobyxmoadg;

        static {
            int[] iArr = new int[ei0.zoijcleaow.values().length];
            try {
                iArr[ei0.zoijcleaow.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ei0.zoijcleaow.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16377iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f16370iobyxmoadg = context;
        this.f16371zoijcleaow = kegysxyocb.iobyxmoadg(new LinkedHashMap());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // fi0.iobyxmoadg
    public Object eablkybsjg(String str, ei0.zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        di0.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc;
        di0.iobyxmoadg iobyxmoadgVar = (di0.iobyxmoadg) ((Map) this.f16371zoijcleaow.getValue()).get(str);
        int i13 = zoijcleaow.f16377iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (iobyxmoadgVar != null) {
                ppxfxbqfkfVarWkgbmnqykc = iobyxmoadgVar.eablkybsjg();
            } else {
                ppxfxbqfkfVarWkgbmnqykc = null;
            }
        } else if (iobyxmoadgVar != null) {
            ppxfxbqfkfVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        } else {
            ppxfxbqfkfVarWkgbmnqykc = null;
        }
        if (ppxfxbqfkfVarWkgbmnqykc != null) {
            return di0.wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVarWkgbmnqykc);
        }
        return null;
    }

    @Override // fi0.iobyxmoadg
    public void gxszxtbevo(String requestId, String str, List headers) {
        Object value;
        Map mapIwizpuwonk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requestId, "requestId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
        zynmafqrjb zynmafqrjbVar = this.f16371zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
            mapIwizpuwonk = tzroggbefp.iwizpuwonk((Map) value);
            di0.iobyxmoadg iobyxmoadgVar = (di0.iobyxmoadg) mapIwizpuwonk.get(requestId);
            if (iobyxmoadgVar != null) {
                di0.iobyxmoadg iobyxmoadgVarZoijcleaow = di0.iobyxmoadg.zoijcleaow(iobyxmoadgVar, null, null, null, new di0.ppxfxbqfkf(System.nanoTime(), str == null ? "" : str, headers), 7, null);
                if (iobyxmoadgVarZoijcleaow != null) {
                    mapIwizpuwonk.put(requestId, iobyxmoadgVarZoijcleaow);
                }
            }
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
    }

    @Override // fi0.iobyxmoadg
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f16371zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
        } while (!zynmafqrjbVar.compareAndSet(value, new LinkedHashMap()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // fi0.iobyxmoadg
    public Object ppxfxbqfkf(NetworkPayload networkPayload, gxszxtbevo gxszxtbevoVar) {
        File file = new File(this.f16370iobyxmoadg.getCacheDir(), "network_logs");
        file.mkdirs();
        String str = String.format("%s.txt", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(System.currentTimeMillis())}, 1));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "format(...)");
        File file2 = new File(file, str);
        StringBuilder sb3 = new StringBuilder();
        List headers = networkPayload.getHeaders();
        if (headers != null) {
            Iterator it = headers.iterator();
            while (it.hasNext()) {
                sb3.append((String) it.next());
                sb3.append('\n');
            }
        }
        String body = networkPayload.getBody();
        if (body != null) {
            sb3.append(body);
            sb3.append('\n');
        }
        String string = sb3.toString();
        FileWriter fileWriter = new FileWriter(file2);
        try {
            fileWriter.write(string);
            fileWriter.flush();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            rg.zoijcleaow.iobyxmoadg(fileWriter, null);
            return file2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(fileWriter, th2);
                throw th3;
            }
        }
    }

    @Override // fi0.iobyxmoadg
    public void wkgbmnqykc(String requestId, URI url, String payload, List headers) {
        Object value;
        Map mapIwizpuwonk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requestId, "requestId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
        zynmafqrjb zynmafqrjbVar = this.f16371zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
            mapIwizpuwonk = tzroggbefp.iwizpuwonk((Map) value);
            String path = url.getPath();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(path, "getPath(...)");
            mapIwizpuwonk.put(requestId, new di0.iobyxmoadg(requestId, path, new di0.ppxfxbqfkf(System.nanoTime(), payload, headers), null, 8, null));
            if (mapIwizpuwonk.size() > 50) {
                mbcevpiqjq.ppxfxbqfkf(mapIwizpuwonk).remove(jyumaefscl.iyctptxqzt(mapIwizpuwonk.keySet()));
            }
        } while (!zynmafqrjbVar.compareAndSet(value, mapIwizpuwonk));
    }

    @Override // fi0.iobyxmoadg
    public lqeggnwhkg zoijcleaow() {
        return new ppxfxbqfkf(dxjokdxxww.iobyxmoadg(this.f16371zoijcleaow));
    }
}
