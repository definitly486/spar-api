package opjhrmiecq;

import android.view.KeyEvent;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final weqkydbzbr f74020btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f74021draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final czzsidtyhn f74022dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f74023eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f74024gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final skhdrjzrfn.h f74025gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final igdgnonuha f74026iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final p0.ylkuphrtab f74027lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final n1 f74028nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final p0.tzroggbefp f74029ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f74030wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final skhdrjzrfn.skhdrjzrfn f74031zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f74032iobyxmoadg;

        static {
            int[] iArr = new int[opjhrmiecq.values().length];
            try {
                iArr[opjhrmiecq.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[opjhrmiecq.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[opjhrmiecq.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[opjhrmiecq.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[opjhrmiecq.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[opjhrmiecq.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[opjhrmiecq.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[opjhrmiecq.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[opjhrmiecq.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[opjhrmiecq.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[opjhrmiecq.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[opjhrmiecq.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[opjhrmiecq.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[opjhrmiecq.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[opjhrmiecq.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[opjhrmiecq.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[opjhrmiecq.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[opjhrmiecq.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[opjhrmiecq.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[opjhrmiecq.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[opjhrmiecq.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[opjhrmiecq.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[opjhrmiecq.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[opjhrmiecq.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[opjhrmiecq.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[opjhrmiecq.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[opjhrmiecq.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[opjhrmiecq.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[opjhrmiecq.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[opjhrmiecq.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[opjhrmiecq.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[opjhrmiecq.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[opjhrmiecq.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[opjhrmiecq.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[opjhrmiecq.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[opjhrmiecq.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[opjhrmiecq.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[opjhrmiecq.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[opjhrmiecq.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[opjhrmiecq.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[opjhrmiecq.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[opjhrmiecq.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[opjhrmiecq.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[opjhrmiecq.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[opjhrmiecq.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[opjhrmiecq.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[opjhrmiecq.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[opjhrmiecq.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[opjhrmiecq.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            f74032iobyxmoadg = iArr;
        }
    }

    public /* synthetic */ w(igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, p0.tzroggbefp tzroggbefpVar, boolean z13, boolean z14, skhdrjzrfn.h hVar, p0.ylkuphrtab ylkuphrtabVar, n1 n1Var, czzsidtyhn czzsidtyhnVar, weqkydbzbr weqkydbzbrVar, tg.draadjrbmk draadjrbmkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(igdgnonuhaVar, skhdrjzrfnVar, tzroggbefpVar, z13, z14, hVar, ylkuphrtabVar, n1Var, czzsidtyhnVar, weqkydbzbrVar, draadjrbmkVar, i13);
    }

    private final void agtfadlqog(tg.draadjrbmk draadjrbmkVar) {
        skhdrjzrfn.auzgnhcxok auzgnhcxokVar = new skhdrjzrfn.auzgnhcxok(this.f74029ppxfxbqfkf, this.f74027lqeggnwhkg, this.f74026iobyxmoadg.agtfadlqog(), this.f74025gxszxtbevo);
        draadjrbmkVar.invoke(auzgnhcxokVar);
        if (j0.l.lqeggnwhkg(auzgnhcxokVar.jyumaefscl(), this.f74029ppxfxbqfkf.gtknphoqwx()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(auzgnhcxokVar.eablkybsjg(), this.f74029ppxfxbqfkf.dxjokdxxww())) {
            return;
        }
        this.f74024gtknphoqwx.invoke(auzgnhcxokVar.vipkmwdibw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww cqumvgiudr(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        Integer numYggfygwlhe = auzgnhcxokVar.yggfygwlhe();
        if (numYggfygwlhe == null) {
            return null;
        }
        return new p0.lqeggnwhkg(j0.l.dxjokdxxww(auzgnhcxokVar.jyumaefscl()) - numYggfygwlhe.intValue(), 0);
    }

    private final void draadjrbmk(List list) {
        p0.draadjrbmk draadjrbmkVarKcexrzcfyt = this.f74026iobyxmoadg.kcexrzcfyt();
        List listP = hg.jyumaefscl.p(list);
        listP.add(0, new p0.ojitshcjhn());
        this.f74024gtknphoqwx.invoke(draadjrbmkVarKcexrzcfyt.zoijcleaow(listP));
    }

    private final p0.iobyxmoadg esjtqupxsv(KeyEvent keyEvent) {
        Integer numIobyxmoadg;
        if (y.iobyxmoadg(keyEvent) && (numIobyxmoadg = this.f74022dxjokdxxww.iobyxmoadg(keyEvent)) != null) {
            return new p0.iobyxmoadg(ezmngbhpjk.iobyxmoadg(new StringBuilder(), numIobyxmoadg.intValue()).toString(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(p0.tzroggbefp tzroggbefpVar) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww iwizpuwonk(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        int iDraadjrbmk = auzgnhcxokVar.draadjrbmk();
        if (iDraadjrbmk != -1) {
            return new p0.lqeggnwhkg(0, iDraadjrbmk - j0.l.dxjokdxxww(auzgnhcxokVar.jyumaefscl()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww jyumaefscl(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        int iOxmwwwfdhm = auzgnhcxokVar.oxmwwwfdhm();
        if (iOxmwwwfdhm == -1) {
            return null;
        }
        return new p0.lqeggnwhkg(j0.l.dxjokdxxww(auzgnhcxokVar.jyumaefscl()) - iOxmwwwfdhm, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww kcexrzcfyt(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        Integer numGxszxtbevo = auzgnhcxokVar.gxszxtbevo();
        if (numGxszxtbevo != null) {
            return new p0.lqeggnwhkg(0, numGxszxtbevo.intValue() - j0.l.dxjokdxxww(auzgnhcxokVar.jyumaefscl()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww oxmwwwfdhm(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        Integer numDxjokdxxww = auzgnhcxokVar.dxjokdxxww();
        if (numDxjokdxxww == null) {
            return null;
        }
        return new p0.lqeggnwhkg(j0.l.dxjokdxxww(auzgnhcxokVar.jyumaefscl()) - numDxjokdxxww.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(opjhrmiecq opjhrmiecqVar, w wVar, kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        p0.tzroggbefp tzroggbefpVarLqeggnwhkg;
        p0.tzroggbefp tzroggbefpVarPpxfxbqfkf;
        switch (opjhrmiecqVar == null ? -1 : iobyxmoadg.f74032iobyxmoadg[opjhrmiecqVar.ordinal()]) {
            case 1:
                wVar.f74031zoijcleaow.pmvmpeiblj(false);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 2:
                wVar.f74031zoijcleaow.weqkydbzbr();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 3:
                wVar.f74031zoijcleaow.yadqdtsiqt();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 4:
                auzgnhcxokVar.zoijcleaow(new tg.draadjrbmk() { // from class: opjhrmiecq.o
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.zdlpuopuiu((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 5:
                auzgnhcxokVar.ppxfxbqfkf(new tg.draadjrbmk() { // from class: opjhrmiecq.p
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.yggfygwlhe((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 6:
                auzgnhcxokVar.istkbnxepw();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 7:
                auzgnhcxokVar.hcddaimhww();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 8:
                auzgnhcxokVar.wwaezpbzkn();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 9:
                auzgnhcxokVar.yadqdtsiqt();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 10:
                auzgnhcxokVar.kegysxyocb();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 11:
                auzgnhcxokVar.pmvmpeiblj();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 12:
                auzgnhcxokVar.okpsazkaxt();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 13:
                auzgnhcxokVar.ikoacuggdj();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 14:
                auzgnhcxokVar.stevsuqkhv();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 15:
                auzgnhcxokVar.cllcsxoeiz();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 16:
                auzgnhcxokVar.dsvhmnatus();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 17:
                auzgnhcxokVar.wypolnanlu();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 18:
                auzgnhcxokVar.hkdspvbjdz();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 19:
                auzgnhcxokVar.jpowsppfya();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 20:
                List listRibwqtqdhb = auzgnhcxokVar.ribwqtqdhb(new tg.draadjrbmk() { // from class: opjhrmiecq.q
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.jyumaefscl((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                if (listRibwqtqdhb != null) {
                    wVar.draadjrbmk(listRibwqtqdhb);
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 21:
                List listRibwqtqdhb2 = auzgnhcxokVar.ribwqtqdhb(new tg.draadjrbmk() { // from class: opjhrmiecq.r
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.iwizpuwonk((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                if (listRibwqtqdhb2 != null) {
                    wVar.draadjrbmk(listRibwqtqdhb2);
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 22:
                List listRibwqtqdhb3 = auzgnhcxokVar.ribwqtqdhb(new tg.draadjrbmk() { // from class: opjhrmiecq.s
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.cqumvgiudr((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                if (listRibwqtqdhb3 != null) {
                    wVar.draadjrbmk(listRibwqtqdhb3);
                    gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 23:
                List listRibwqtqdhb4 = auzgnhcxokVar.ribwqtqdhb(new tg.draadjrbmk() { // from class: opjhrmiecq.t
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.vdvldrhtss((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                if (listRibwqtqdhb4 != null) {
                    wVar.draadjrbmk(listRibwqtqdhb4);
                    gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 24:
                List listRibwqtqdhb5 = auzgnhcxokVar.ribwqtqdhb(new tg.draadjrbmk() { // from class: opjhrmiecq.u
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.oxmwwwfdhm((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                if (listRibwqtqdhb5 != null) {
                    wVar.draadjrbmk(listRibwqtqdhb5);
                    gg.wwaezpbzkn wwaezpbzknVar5 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case C4007z9.F /* 25 */:
                List listRibwqtqdhb6 = auzgnhcxokVar.ribwqtqdhb(new tg.draadjrbmk() { // from class: opjhrmiecq.v
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return w.kcexrzcfyt((skhdrjzrfn.auzgnhcxok) obj);
                    }
                });
                if (listRibwqtqdhb6 != null) {
                    wVar.draadjrbmk(listRibwqtqdhb6);
                    gg.wwaezpbzkn wwaezpbzknVar6 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case C4007z9.G /* 26 */:
                if (wVar.f74023eablkybsjg) {
                    ylkuphrtabVar.f60038zdlpuopuiu = ((Boolean) wVar.f74026iobyxmoadg.vdvldrhtss().invoke(p0.kcexrzcfyt.btonecajqb(wVar.f74021draadjrbmk))).booleanValue();
                } else {
                    wVar.wflxmlrfwp(new p0.iobyxmoadg("\n", 1));
                }
                gg.wwaezpbzkn wwaezpbzknVar7 = gg.wwaezpbzkn.f37140iobyxmoadg;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 27:
                if (wVar.f74023eablkybsjg) {
                    ylkuphrtabVar.f60038zdlpuopuiu = false;
                } else {
                    wVar.wflxmlrfwp(new p0.iobyxmoadg("\t", 1));
                }
                gg.wwaezpbzkn wwaezpbzknVar8 = gg.wwaezpbzkn.f37140iobyxmoadg;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 28:
                auzgnhcxokVar.tzroggbefp();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case C4007z9.I /* 29 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.zynmafqrjb()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 30:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.pkzmftpjix()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.istkbnxepw()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 32:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.hcddaimhww()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 33:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.wwaezpbzkn()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.yadqdtsiqt()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case C4007z9.J /* 35 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.stevsuqkhv()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.cllcsxoeiz()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.dsvhmnatus()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case C4007z9.K /* 38 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.wypolnanlu()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.kegysxyocb()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 40:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.pmvmpeiblj()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                auzgnhcxokVar.okpsazkaxt().mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 42:
                auzgnhcxokVar.ikoacuggdj().mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 43:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.hkdspvbjdz()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                ((skhdrjzrfn.auzgnhcxok) auzgnhcxokVar.jpowsppfya()).mbcevpiqjq();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                auzgnhcxokVar.wkgbmnqykc();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 46:
                n1 n1Var = wVar.f74028nufgyqmvbu;
                if (n1Var != null) {
                    n1Var.zoijcleaow(auzgnhcxokVar.vipkmwdibw());
                }
                n1 n1Var2 = wVar.f74028nufgyqmvbu;
                if (n1Var2 != null && (tzroggbefpVarLqeggnwhkg = n1Var2.lqeggnwhkg()) != null) {
                    wVar.f74024gtknphoqwx.invoke(tzroggbefpVarLqeggnwhkg);
                    gg.wwaezpbzkn wwaezpbzknVar9 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 47:
                n1 n1Var3 = wVar.f74028nufgyqmvbu;
                if (n1Var3 != null && (tzroggbefpVarPpxfxbqfkf = n1Var3.ppxfxbqfkf()) != null) {
                    wVar.f74024gtknphoqwx.invoke(tzroggbefpVarPpxfxbqfkf);
                    gg.wwaezpbzkn wwaezpbzknVar10 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            case 48:
                iyctptxqzt.zoijcleaow();
            case 49:
                gg.wwaezpbzkn wwaezpbzknVar11 = gg.wwaezpbzkn.f37140iobyxmoadg;
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww vdvldrhtss(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        Integer numWflxmlrfwp = auzgnhcxokVar.wflxmlrfwp();
        if (numWflxmlrfwp != null) {
            return new p0.lqeggnwhkg(0, numWflxmlrfwp.intValue() - j0.l.dxjokdxxww(auzgnhcxokVar.jyumaefscl()));
        }
        return null;
    }

    private final void wflxmlrfwp(p0.dxjokdxxww dxjokdxxwwVar) {
        draadjrbmk(hg.jyumaefscl.eablkybsjg(dxjokdxxwwVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yggfygwlhe(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        auzgnhcxokVar.pkzmftpjix();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zdlpuopuiu(skhdrjzrfn.auzgnhcxok auzgnhcxokVar) {
        auzgnhcxokVar.zynmafqrjb();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean ojitshcjhn(KeyEvent keyEvent) {
        final opjhrmiecq opjhrmiecqVarIobyxmoadg;
        p0.iobyxmoadg iobyxmoadgVarEsjtqupxsv = esjtqupxsv(keyEvent);
        if (iobyxmoadgVarEsjtqupxsv != null) {
            if (!this.f74030wkgbmnqykc) {
                return false;
            }
            wflxmlrfwp(iobyxmoadgVarEsjtqupxsv);
            this.f74025gxszxtbevo.zoijcleaow();
            return true;
        }
        if (!r.ppxfxbqfkf.eablkybsjg(r.wkgbmnqykc.zoijcleaow(keyEvent), r.ppxfxbqfkf.f81321iobyxmoadg.iobyxmoadg()) || (opjhrmiecqVarIobyxmoadg = this.f74020btonecajqb.iobyxmoadg(keyEvent)) == null || (opjhrmiecqVarIobyxmoadg.wkgbmnqykc() && !this.f74030wkgbmnqykc)) {
            return false;
        }
        final kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar = new kotlin.jvm.internal.ylkuphrtab();
        ylkuphrtabVar.f60038zdlpuopuiu = true;
        agtfadlqog(new tg.draadjrbmk() { // from class: opjhrmiecq.m
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return w.rgvfuqvkyq(opjhrmiecqVarIobyxmoadg, this, ylkuphrtabVar, (skhdrjzrfn.auzgnhcxok) obj);
            }
        });
        n1 n1Var = this.f74028nufgyqmvbu;
        if (n1Var != null) {
            n1Var.iobyxmoadg();
        }
        return ylkuphrtabVar.f60038zdlpuopuiu;
    }

    private w(igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, p0.tzroggbefp tzroggbefpVar, boolean z13, boolean z14, skhdrjzrfn.h hVar, p0.ylkuphrtab ylkuphrtabVar, n1 n1Var, czzsidtyhn czzsidtyhnVar, weqkydbzbr weqkydbzbrVar, tg.draadjrbmk draadjrbmkVar, int i13) {
        this.f74026iobyxmoadg = igdgnonuhaVar;
        this.f74031zoijcleaow = skhdrjzrfnVar;
        this.f74029ppxfxbqfkf = tzroggbefpVar;
        this.f74030wkgbmnqykc = z13;
        this.f74023eablkybsjg = z14;
        this.f74025gxszxtbevo = hVar;
        this.f74027lqeggnwhkg = ylkuphrtabVar;
        this.f74028nufgyqmvbu = n1Var;
        this.f74022dxjokdxxww = czzsidtyhnVar;
        this.f74020btonecajqb = weqkydbzbrVar;
        this.f74024gtknphoqwx = draadjrbmkVar;
        this.f74021draadjrbmk = i13;
    }

    public /* synthetic */ w(igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, p0.tzroggbefp tzroggbefpVar, boolean z13, boolean z14, skhdrjzrfn.h hVar, p0.ylkuphrtab ylkuphrtabVar, n1 n1Var, czzsidtyhn czzsidtyhnVar, weqkydbzbr weqkydbzbrVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(igdgnonuhaVar, skhdrjzrfnVar, (i14 & 4) != 0 ? new p0.tzroggbefp((String) null, 0L, (j0.l) null, 7, (kotlin.jvm.internal.gtknphoqwx) null) : tzroggbefpVar, (i14 & 8) != 0 ? true : z13, (i14 & 16) != 0 ? false : z14, hVar, (i14 & 64) != 0 ? p0.ylkuphrtab.f75324iobyxmoadg.iobyxmoadg() : ylkuphrtabVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : n1Var, czzsidtyhnVar, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? zeieaojujs.iobyxmoadg() : weqkydbzbrVar, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? new tg.draadjrbmk() { // from class: opjhrmiecq.n
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return w.gtknphoqwx((p0.tzroggbefp) obj);
            }
        } : draadjrbmkVar, i13, null);
    }
}
