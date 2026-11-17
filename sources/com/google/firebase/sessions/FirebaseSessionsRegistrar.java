package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.gxszxtbevo;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import o9.btonecajqb;
import od.nufgyqmvbu;
import pj.pkzmftpjix;
import ub.pmvmpeiblj;
import ub.vdvldrhtss;
import ub.wkgbmnqykc;
import uc.eablkybsjg;
import ud.cqumvgiudr;
import ud.iozdgvuglv;
import ud.lmojexxdyd;
import ud.lqeggnwhkg;
import ud.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lub/ppxfxbqfkf;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "iobyxmoadg", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final iobyxmoadg Companion = new iobyxmoadg(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final pmvmpeiblj backgroundDispatcher;
    private static final pmvmpeiblj blockingDispatcher;
    private static final pmvmpeiblj firebaseApp;
    private static final pmvmpeiblj firebaseInstallationsApi;
    private static final pmvmpeiblj sessionLifecycleServiceBinder;
    private static final pmvmpeiblj sessionsSettings;
    private static final pmvmpeiblj transportFactory;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        pmvmpeiblj pmvmpeibljVarZoijcleaow = pmvmpeiblj.zoijcleaow(gxszxtbevo.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarZoijcleaow, "unqualified(FirebaseApp::class.java)");
        firebaseApp = pmvmpeibljVarZoijcleaow;
        pmvmpeiblj pmvmpeibljVarZoijcleaow2 = pmvmpeiblj.zoijcleaow(eablkybsjg.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarZoijcleaow2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = pmvmpeibljVarZoijcleaow2;
        pmvmpeiblj pmvmpeibljVarIobyxmoadg = pmvmpeiblj.iobyxmoadg(tb.iobyxmoadg.class, pkzmftpjix.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarIobyxmoadg, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = pmvmpeibljVarIobyxmoadg;
        pmvmpeiblj pmvmpeibljVarIobyxmoadg2 = pmvmpeiblj.iobyxmoadg(tb.zoijcleaow.class, pkzmftpjix.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarIobyxmoadg2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = pmvmpeibljVarIobyxmoadg2;
        pmvmpeiblj pmvmpeibljVarZoijcleaow3 = pmvmpeiblj.zoijcleaow(btonecajqb.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarZoijcleaow3, "unqualified(TransportFactory::class.java)");
        transportFactory = pmvmpeibljVarZoijcleaow3;
        pmvmpeiblj pmvmpeibljVarZoijcleaow4 = pmvmpeiblj.zoijcleaow(wd.gxszxtbevo.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarZoijcleaow4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = pmvmpeibljVarZoijcleaow4;
        pmvmpeiblj pmvmpeibljVarZoijcleaow5 = pmvmpeiblj.zoijcleaow(iozdgvuglv.class);
        zdlpuopuiu.dxjokdxxww(pmvmpeibljVarZoijcleaow5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = pmvmpeibljVarZoijcleaow5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ud.gtknphoqwx getComponents$lambda$0(wkgbmnqykc wkgbmnqykcVar) {
        Object objZoijcleaow = wkgbmnqykcVar.zoijcleaow(firebaseApp);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "container[firebaseApp]");
        Object objZoijcleaow2 = wkgbmnqykcVar.zoijcleaow(sessionsSettings);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow2, "container[sessionsSettings]");
        Object objZoijcleaow3 = wkgbmnqykcVar.zoijcleaow(backgroundDispatcher);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow3, "container[backgroundDispatcher]");
        Object objZoijcleaow4 = wkgbmnqykcVar.zoijcleaow(sessionLifecycleServiceBinder);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow4, "container[sessionLifecycleServiceBinder]");
        return new ud.gtknphoqwx((gxszxtbevo) objZoijcleaow, (wd.gxszxtbevo) objZoijcleaow2, (lg.btonecajqb) objZoijcleaow3, (iozdgvuglv) objZoijcleaow4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ppxfxbqfkf getComponents$lambda$1(wkgbmnqykc wkgbmnqykcVar) {
        return new ppxfxbqfkf(ud.pkzmftpjix.f113405iobyxmoadg, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow getComponents$lambda$2(wkgbmnqykc wkgbmnqykcVar) {
        Object objZoijcleaow = wkgbmnqykcVar.zoijcleaow(firebaseApp);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "container[firebaseApp]");
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) objZoijcleaow;
        Object objZoijcleaow2 = wkgbmnqykcVar.zoijcleaow(firebaseInstallationsApi);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow2, "container[firebaseInstallationsApi]");
        eablkybsjg eablkybsjgVar = (eablkybsjg) objZoijcleaow2;
        Object objZoijcleaow3 = wkgbmnqykcVar.zoijcleaow(sessionsSettings);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow3, "container[sessionsSettings]");
        wd.gxszxtbevo gxszxtbevoVar2 = (wd.gxszxtbevo) objZoijcleaow3;
        tc.zoijcleaow zoijcleaowVarLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg(transportFactory);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarLqeggnwhkg, "container.getProvider(transportFactory)");
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(zoijcleaowVarLqeggnwhkg);
        Object objZoijcleaow4 = wkgbmnqykcVar.zoijcleaow(backgroundDispatcher);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow4, "container[backgroundDispatcher]");
        return new zynmafqrjb(gxszxtbevoVar, eablkybsjgVar, gxszxtbevoVar2, lqeggnwhkgVar, (lg.btonecajqb) objZoijcleaow4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd.gxszxtbevo getComponents$lambda$3(wkgbmnqykc wkgbmnqykcVar) {
        Object objZoijcleaow = wkgbmnqykcVar.zoijcleaow(firebaseApp);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "container[firebaseApp]");
        Object objZoijcleaow2 = wkgbmnqykcVar.zoijcleaow(blockingDispatcher);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow2, "container[blockingDispatcher]");
        Object objZoijcleaow3 = wkgbmnqykcVar.zoijcleaow(backgroundDispatcher);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow3, "container[backgroundDispatcher]");
        Object objZoijcleaow4 = wkgbmnqykcVar.zoijcleaow(firebaseInstallationsApi);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow4, "container[firebaseInstallationsApi]");
        return new wd.gxszxtbevo((gxszxtbevo) objZoijcleaow, (lg.btonecajqb) objZoijcleaow2, (lg.btonecajqb) objZoijcleaow3, (eablkybsjg) objZoijcleaow4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.iobyxmoadg getComponents$lambda$4(wkgbmnqykc wkgbmnqykcVar) {
        Context contextGtknphoqwx = ((gxszxtbevo) wkgbmnqykcVar.zoijcleaow(firebaseApp)).gtknphoqwx();
        zdlpuopuiu.dxjokdxxww(contextGtknphoqwx, "container[firebaseApp].applicationContext");
        Object objZoijcleaow = wkgbmnqykcVar.zoijcleaow(backgroundDispatcher);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "container[backgroundDispatcher]");
        return new cqumvgiudr(contextGtknphoqwx, (lg.btonecajqb) objZoijcleaow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iozdgvuglv getComponents$lambda$5(wkgbmnqykc wkgbmnqykcVar) {
        Object objZoijcleaow = wkgbmnqykcVar.zoijcleaow(firebaseApp);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "container[firebaseApp]");
        return new lmojexxdyd((gxszxtbevo) objZoijcleaow);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ub.ppxfxbqfkf> getComponents() {
        ub.ppxfxbqfkf.zoijcleaow zoijcleaowVarNufgyqmvbu = ub.ppxfxbqfkf.ppxfxbqfkf(ud.gtknphoqwx.class).nufgyqmvbu(LIBRARY_NAME);
        pmvmpeiblj pmvmpeibljVar = firebaseApp;
        ub.ppxfxbqfkf.zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaowVarNufgyqmvbu.zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar));
        pmvmpeiblj pmvmpeibljVar2 = sessionsSettings;
        ub.ppxfxbqfkf.zoijcleaow zoijcleaowVarZoijcleaow2 = zoijcleaowVarZoijcleaow.zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar2));
        pmvmpeiblj pmvmpeibljVar3 = backgroundDispatcher;
        ub.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = zoijcleaowVarZoijcleaow2.zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar3)).zoijcleaow(vdvldrhtss.draadjrbmk(sessionLifecycleServiceBinder)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: ud.wflxmlrfwp
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(wkgbmnqykcVar);
            }
        }).eablkybsjg().wkgbmnqykc();
        ub.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc2 = ub.ppxfxbqfkf.ppxfxbqfkf(ppxfxbqfkf.class).nufgyqmvbu("session-generator").gxszxtbevo(new ub.lqeggnwhkg() { // from class: ud.agtfadlqog
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(wkgbmnqykcVar);
            }
        }).wkgbmnqykc();
        ub.ppxfxbqfkf.zoijcleaow zoijcleaowVarZoijcleaow3 = ub.ppxfxbqfkf.ppxfxbqfkf(zoijcleaow.class).nufgyqmvbu("session-publisher").zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar));
        pmvmpeiblj pmvmpeibljVar4 = firebaseInstallationsApi;
        return jyumaefscl.rgvfuqvkyq(ppxfxbqfkfVarWkgbmnqykc, ppxfxbqfkfVarWkgbmnqykc2, zoijcleaowVarZoijcleaow3.zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar4)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar2)).zoijcleaow(vdvldrhtss.agtfadlqog(transportFactory)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar3)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: ud.ojitshcjhn
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$2(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.ppxfxbqfkf(wd.gxszxtbevo.class).nufgyqmvbu("sessions-settings").zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar)).zoijcleaow(vdvldrhtss.draadjrbmk(blockingDispatcher)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar3)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar4)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: ud.rgvfuqvkyq
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$3(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.ppxfxbqfkf(com.google.firebase.sessions.iobyxmoadg.class).nufgyqmvbu("sessions-datastore").zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar)).zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar3)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: ud.vdvldrhtss
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$4(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), ub.ppxfxbqfkf.ppxfxbqfkf(iozdgvuglv.class).nufgyqmvbu("sessions-service-binder").zoijcleaow(vdvldrhtss.draadjrbmk(pmvmpeibljVar)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: ud.oxmwwwfdhm
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$5(wkgbmnqykcVar);
            }
        }).wkgbmnqykc(), nufgyqmvbu.zoijcleaow(LIBRARY_NAME, "2.0.6"));
    }
}
