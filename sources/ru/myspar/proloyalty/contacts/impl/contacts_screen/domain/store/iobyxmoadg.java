package ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store;

import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.tzroggbefp;
import j0.l;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.contacts.api.model.ContactsScreenPayload;
import ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.model.ContactItem;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final p01.zoijcleaow f94166eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final vm0.zoijcleaow f94167gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ur0.iobyxmoadg f94168lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f94169nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f94170ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iw0.gxszxtbevo f94171wkgbmnqykc;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final C2217iobyxmoadg f94165dxjokdxxww = new C2217iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final int f94164btonecajqb = 8;

    static final class eablkybsjg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f94172yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94173zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f94173zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f94172yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f94172yggfygwlhe = th2;
            return eablkybsjgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class gxszxtbevo extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        gxszxtbevo(Object obj) {
            super(2, obj, iobyxmoadg.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.ydmasvzmpa((iobyxmoadg) this.f60022zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2217iobyxmoadg {
        public /* synthetic */ C2217iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2217iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ p01.zoijcleaow.iobyxmoadg f94174jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94176zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(p01.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f94174jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f94174jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f94176zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.iobyxmoadg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    p01.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = this.f94174jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    p01.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f94166eablkybsjg;
                    this.f94176zdlpuopuiu = 1;
                    if (zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.crxdokpmqz(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.iobyxmoadg.f94195iobyxmoadg);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.sflfametgt(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf f94177jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94179zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f94177jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f94177jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f94179zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iw0.gxszxtbevo gxszxtbevoVar = iobyxmoadg.this.f94171wkgbmnqykc;
                String strDraadjrbmk = ((ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.wkgbmnqykc) this.f94177jyumaefscl).iobyxmoadg().draadjrbmk();
                this.f94179zdlpuopuiu = 1;
                if (gxszxtbevoVar.dxjokdxxww(strDraadjrbmk, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f94180zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2218iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f94181zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.iobyxmoadg$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2219iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f94183yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f94184zdlpuopuiu;

                public C2219iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f94184zdlpuopuiu = obj;
                    this.f94183yggfygwlhe |= Integer.MIN_VALUE;
                    return C2218iobyxmoadg.this.emit(null, this);
                }
            }

            public C2218iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f94181zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2219iobyxmoadg c2219iobyxmoadg;
                if (gxszxtbevoVar instanceof C2219iobyxmoadg) {
                    c2219iobyxmoadg = (C2219iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2219iobyxmoadg.f94183yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2219iobyxmoadg.f94183yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2219iobyxmoadg = new C2219iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2219iobyxmoadg = new C2219iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2219iobyxmoadg.f94184zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2219iobyxmoadg.f94183yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f94181zdlpuopuiu;
                    Map map = (Map) obj;
                    Object c2216eablkybsjg = map == null ? new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.C2216eablkybsjg(ContactsStore$SearchContent.Empty.f94152zdlpuopuiu) : new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.zoijcleaow(map);
                    c2219iobyxmoadg.f94183yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c2216eablkybsjg, c2219iobyxmoadg) == objGxszxtbevo) {
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

        public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f94180zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f94180zdlpuopuiu.collect(new C2218iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94186zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f94186zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ur0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f94168lqeggnwhkg;
                String name = iobyxmoadg.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f94186zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(name, "android.permission.READ_CONTACTS", this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            ur0.ppxfxbqfkf ppxfxbqfkfVar = (ur0.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.zoijcleaow) {
                iobyxmoadg.this.yfnezrywwk();
            } else {
                if (!(ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.crxdokpmqz(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.ppxfxbqfkf.f94196iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, iw0.gxszxtbevo subscribeOnSearchContactsUseCase, p01.zoijcleaow changeCartReceiverUseCase, vm0.zoijcleaow analyticsTracker, ur0.iobyxmoadg permissionManager) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeOnSearchContactsUseCase, "subscribeOnSearchContactsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartReceiverUseCase, "changeCartReceiverUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        this.f94170ppxfxbqfkf = dispatchersProvider;
        this.f94171wkgbmnqykc = subscribeOnSearchContactsUseCase;
        this.f94166eablkybsjg = changeCartReceiverUseCase;
        this.f94167gxszxtbevo = analyticsTracker;
        this.f94168lqeggnwhkg = permissionManager;
    }

    private final void ribwqtqdhb() {
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        ContactsStore$SearchContent searchContent = ((State) jlmebxxoox()).getSearchContent();
        ContactItem contactItemZoijcleaow = searchContent != null ? searchContent.zoijcleaow() : null;
        if (contactItemZoijcleaow != null) {
            vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(contactItemZoijcleaow.getContactName(), contactItemZoijcleaow.getContactPhone());
        } else {
            EditContact editContact = ((State) jlmebxxoox()).getEditContact();
            vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(editContact.getName().draadjrbmk(), editContact.getPhone().draadjrbmk());
        }
        String str = (String) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
        String str2 = (String) vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
        ContactsScreenPayload payload = ((State) jlmebxxoox()).getPayload();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uwvvkdfqfp(str2), payload.getPhone()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, payload.getName())) {
            crxdokpmqz(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.iobyxmoadg.f94195iobyxmoadg);
        } else {
            zfvoamnweg(new p01.zoijcleaow.iobyxmoadg.C1652zoijcleaow(str, str2));
        }
    }

    private final void rlfsiqarku() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
    }

    private final String uwvvkdfqfp(String str) {
        return mj.kcexrzcfyt.jpowsppfya(str, "+", "", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ydmasvzmpa(iobyxmoadg iobyxmoadgVar, ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.ulzqkzuiru(eablkybsjgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk() {
        this.f94167gxszxtbevo.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Receiver.f92368iwizpuwonk, AnalyticsPage.ReceiverFromContacts.f92369iwizpuwonk, null, null, null, 28, null)));
        ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.C2216eablkybsjg(new ContactsStore$SearchContent.ContactList(true, tzroggbefp.dxjokdxxww(), new p0.tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null), null)));
        cr0.iobyxmoadg.iobyxmoadg(this.f94169nufgyqmvbu);
        this.f94169nufgyqmvbu = dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(new wkgbmnqykc(dxjokdxxww.gxszxtbevo(this.f94171wkgbmnqykc.zoijcleaow(new iw0.gxszxtbevo.zoijcleaow(null)), new eablkybsjg(null))), new gxszxtbevo(this)), sopmlzcsov());
    }

    private final auzgnhcxok zfvoamnweg(p01.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(iobyxmoadgVar, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.eablkybsjg) {
            rlfsiqarku();
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.nufgyqmvbu) {
            ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.lqeggnwhkg(((ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.nufgyqmvbu) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.wkgbmnqykc) {
            ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.gxszxtbevo(((ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.wkgbmnqykc) intent).iobyxmoadg()));
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, null), 3, null);
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.zoijcleaow) {
            ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.ppxfxbqfkf(((ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.zoijcleaow) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.C2220ppxfxbqfkf) {
            ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.wkgbmnqykc(((ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.C2220ppxfxbqfkf) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.gxszxtbevo) {
            if (((State) jlmebxxoox()).getSearchContent() != null) {
                ulzqkzuiru(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.eablkybsjg.C2216eablkybsjg(null));
                return;
            } else {
                crxdokpmqz(ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.iobyxmoadg.f94195iobyxmoadg);
                return;
            }
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.iobyxmoadg.f94189iobyxmoadg)) {
            ribwqtqdhb();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.lqeggnwhkg.f94190iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            zfvoamnweg(p01.zoijcleaow.iobyxmoadg.C1651iobyxmoadg.f75385iobyxmoadg);
        }
    }

    public final void sflfametgt(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new ru.myspar.proloyalty.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.zoijcleaow(error));
    }
}
