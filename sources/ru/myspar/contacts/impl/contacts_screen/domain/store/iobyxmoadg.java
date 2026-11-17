package ru.myspar.contacts.impl.contacts_screen.domain.store;

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
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.contacts.api.model.ContactsScreenPayload;
import ru.myspar.contacts.impl.contacts_screen.domain.model.ContactItem;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final f20.zoijcleaow f86433eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lo.zoijcleaow f86434gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final at.iobyxmoadg f86435lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f86436nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f86437ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lx.gxszxtbevo f86438wkgbmnqykc;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final C1982iobyxmoadg f86432dxjokdxxww = new C1982iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final int f86431btonecajqb = 8;

    static final class eablkybsjg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f86439yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86440zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f86440zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f86439yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f86439yggfygwlhe = th2;
            return eablkybsjgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class gxszxtbevo extends kotlin.jvm.internal.iobyxmoadg implements rgvfuqvkyq {
        gxszxtbevo(Object obj) {
            super(2, obj, iobyxmoadg.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.ydmasvzmpa((iobyxmoadg) this.f60022zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.contacts.impl.contacts_screen.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1982iobyxmoadg {
        public /* synthetic */ C1982iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1982iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ f20.zoijcleaow.iobyxmoadg f86441jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86443zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(f20.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f86441jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f86441jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86443zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.iobyxmoadg(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    f20.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = this.f86441jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    f20.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f86433eablkybsjg;
                    this.f86443zdlpuopuiu = 1;
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
                iobyxmoadgVar5.crxdokpmqz(ru.myspar.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.iobyxmoadg.f86462iobyxmoadg);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.sflfametgt(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf f86444jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86446zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f86444jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f86444jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86446zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lx.gxszxtbevo gxszxtbevoVar = iobyxmoadg.this.f86438wkgbmnqykc;
                String strDraadjrbmk = ((ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.wkgbmnqykc) this.f86444jyumaefscl).iobyxmoadg().draadjrbmk();
                this.f86446zdlpuopuiu = 1;
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
        final /* synthetic */ sj.lqeggnwhkg f86447zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.contacts.impl.contacts_screen.domain.store.iobyxmoadg$wkgbmnqykc$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1983iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f86448zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.contacts.impl.contacts_screen.domain.store.iobyxmoadg$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1984iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f86450yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f86451zdlpuopuiu;

                public C1984iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f86451zdlpuopuiu = obj;
                    this.f86450yggfygwlhe |= Integer.MIN_VALUE;
                    return C1983iobyxmoadg.this.emit(null, this);
                }
            }

            public C1983iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f86448zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1984iobyxmoadg c1984iobyxmoadg;
                if (gxszxtbevoVar instanceof C1984iobyxmoadg) {
                    c1984iobyxmoadg = (C1984iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1984iobyxmoadg.f86450yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1984iobyxmoadg.f86450yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1984iobyxmoadg = new C1984iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1984iobyxmoadg = new C1984iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1984iobyxmoadg.f86451zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1984iobyxmoadg.f86450yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f86448zdlpuopuiu;
                    Map map = (Map) obj;
                    Object c1981eablkybsjg = map == null ? new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.C1981eablkybsjg(ContactsStore$SearchContent.Empty.f86419zdlpuopuiu) : new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.zoijcleaow(map);
                    c1984iobyxmoadg.f86450yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c1981eablkybsjg, c1984iobyxmoadg) == objGxszxtbevo) {
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
            this.f86447zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f86447zdlpuopuiu.collect(new C1983iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86453zdlpuopuiu;

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
            int i13 = this.f86453zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                at.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f86435lqeggnwhkg;
                String name = iobyxmoadg.this.getClass().getName();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
                this.f86453zdlpuopuiu = 1;
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
            at.ppxfxbqfkf ppxfxbqfkfVar = (at.ppxfxbqfkf) obj;
            if (ppxfxbqfkfVar instanceof at.ppxfxbqfkf.zoijcleaow) {
                iobyxmoadg.this.yfnezrywwk();
            } else {
                if (!(ppxfxbqfkfVar instanceof at.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.crxdokpmqz(ru.myspar.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.ppxfxbqfkf.f86463iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, lx.gxszxtbevo subscribeOnSearchContactsUseCase, f20.zoijcleaow changeCartReceiverUseCase, lo.zoijcleaow analyticsTracker, at.iobyxmoadg permissionManager) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeOnSearchContactsUseCase, "subscribeOnSearchContactsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartReceiverUseCase, "changeCartReceiverUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        this.f86437ppxfxbqfkf = dispatchersProvider;
        this.f86438wkgbmnqykc = subscribeOnSearchContactsUseCase;
        this.f86433eablkybsjg = changeCartReceiverUseCase;
        this.f86434gxszxtbevo = analyticsTracker;
        this.f86435lqeggnwhkg = permissionManager;
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
            crxdokpmqz(ru.myspar.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.iobyxmoadg.f86462iobyxmoadg);
        } else {
            zfvoamnweg(new f20.zoijcleaow.iobyxmoadg.C0713zoijcleaow(str, str2));
        }
    }

    private final void rlfsiqarku() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(null), 3, null);
    }

    private final String uwvvkdfqfp(String str) {
        return mj.kcexrzcfyt.jpowsppfya(str, "+", "", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ydmasvzmpa(iobyxmoadg iobyxmoadgVar, ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.ulzqkzuiru(eablkybsjgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk() {
        this.f86434gxszxtbevo.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Receiver.f84340iwizpuwonk, AnalyticsPage.ReceiverFromContacts.f84341iwizpuwonk, null, null, null, 28, null)));
        ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.C1981eablkybsjg(new ContactsStore$SearchContent.ContactList(true, tzroggbefp.dxjokdxxww(), new p0.tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null), null)));
        ms.iobyxmoadg.iobyxmoadg(this.f86436nufgyqmvbu);
        this.f86436nufgyqmvbu = dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(new wkgbmnqykc(dxjokdxxww.gxszxtbevo(this.f86438wkgbmnqykc.zoijcleaow(new lx.gxszxtbevo.zoijcleaow(null)), new eablkybsjg(null))), new gxszxtbevo(this)), sopmlzcsov());
    }

    private final auzgnhcxok zfvoamnweg(f20.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(iobyxmoadgVar, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.eablkybsjg) {
            rlfsiqarku();
            return;
        }
        if (intent instanceof ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.nufgyqmvbu) {
            ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.lqeggnwhkg(((ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.nufgyqmvbu) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.wkgbmnqykc) {
            ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.gxszxtbevo(((ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.wkgbmnqykc) intent).iobyxmoadg()));
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, null), 3, null);
            return;
        }
        if (intent instanceof ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.zoijcleaow) {
            ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.ppxfxbqfkf(((ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.zoijcleaow) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.C1985ppxfxbqfkf) {
            ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.wkgbmnqykc(((ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.C1985ppxfxbqfkf) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.gxszxtbevo) {
            if (((State) jlmebxxoox()).getSearchContent() != null) {
                ulzqkzuiru(new ru.myspar.contacts.impl.contacts_screen.domain.store.eablkybsjg.C1981eablkybsjg(null));
                return;
            } else {
                crxdokpmqz(ru.myspar.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.iobyxmoadg.f86462iobyxmoadg);
                return;
            }
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.iobyxmoadg.f86456iobyxmoadg)) {
            ribwqtqdhb();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.contacts.impl.contacts_screen.domain.store.ppxfxbqfkf.lqeggnwhkg.f86457iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            zfvoamnweg(f20.zoijcleaow.iobyxmoadg.C0712iobyxmoadg.f32630iobyxmoadg);
        }
    }

    public final void sflfametgt(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new ru.myspar.contacts.impl.contacts_screen.domain.store.wkgbmnqykc.zoijcleaow(error));
    }
}
