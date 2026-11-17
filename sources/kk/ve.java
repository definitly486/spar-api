package kk;

import kotlin.NoWhenBranchMatchedException;
import npi.spay.Cn;
import spay.sdk.domain.model.DeprecatedPaymentMethod;
import spay.sdk.domain.model.HelperScenario;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ve implements pc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final xf f58997iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final bt f58998ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public mb f58999wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jlmebxxoox f59000zoijcleaow;

    public ve(xf sPayStorage, jlmebxxoox sPayDataContract, bt metricFacade) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        this.f58997iobyxmoadg = sPayStorage;
        this.f59000zoijcleaow = sPayDataContract;
        this.f58998ppxfxbqfkf = metricFacade;
    }

    public final void iobyxmoadg(jd jdVar, long j13) {
        hl pvVar;
        boolean z13 = false;
        if (jdVar instanceof b0) {
            pvVar = new zb0(jdVar, j13);
        } else {
            if (jdVar instanceof iyctptxqzt ? true : jdVar instanceof eslsurpljm ? true : jdVar instanceof g3) {
                pvVar = new zb0(jdVar, j13);
            } else {
                if (jdVar instanceof d1 ? true : jdVar instanceof f2) {
                    pvVar = new pv("Системная или внутренняя ошибка");
                } else if (jdVar instanceof t7) {
                    pvVar = new zb0(jdVar, j13);
                } else if (jdVar instanceof l4) {
                    pvVar = new zb0(jdVar, j13);
                } else {
                    if (!(jdVar instanceof v8 ? true : jdVar instanceof y9 ? true : jdVar instanceof eb ? true : jdVar instanceof gc ? true : jdVar instanceof q6 ? true : jdVar instanceof n5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pvVar = new pv("Системная или внутренняя ошибка");
                }
            }
            z13 = true;
        }
        ij ijVar = (ij) this.f58997iobyxmoadg;
        ijVar.ppxfxbqfkf(ln.iobyxmoadg(ijVar.iobyxmoadg(), pvVar, null, z13, 2));
    }

    /* JADX WARN: Type inference failed for: r12v91, types: [kotlin.jvm.internal.jyumaefscl, tg.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r12v93, types: [kotlin.jvm.internal.jyumaefscl, tg.iobyxmoadg] */
    public final void zoijcleaow(kz action) {
        ay ayVar;
        ay ayVar2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        hl ua0Var;
        Boolean bool;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        hl gtVar;
        hl l00Var;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (action instanceof bh) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(tw.f58728iobyxmoadg);
            return;
        }
        boolean z13 = false;
        n80 n80Var = null;
        if (action instanceof wo) {
            ij ijVar = (ij) this.f58997iobyxmoadg;
            wo woVar = (wo) action;
            ijVar.ppxfxbqfkf(ln.iobyxmoadg(ijVar.iobyxmoadg(), new rf0(woVar.f59185iobyxmoadg, woVar.f59186zoijcleaow), null, false, 2));
            return;
        }
        if (action instanceof pm) {
            pm pmVar = (pm) action;
            ((ij) this.f58997iobyxmoadg).zoijcleaow(new le0(pmVar.f58100iobyxmoadg, null, pmVar.f58101zoijcleaow, 2));
            return;
        }
        if (action instanceof jk) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(id0.f57031iobyxmoadg);
            return;
        }
        if (action instanceof ml) {
            xf xfVar = this.f58997iobyxmoadg;
            ml mlVar = (ml) action;
            mlVar.getClass();
            ((ij) xfVar).zoijcleaow(new le0(xh.f59306iobyxmoadg, mlVar.f57655iobyxmoadg, false, 4));
            return;
        }
        if (action instanceof ec0) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(yq.f59472iobyxmoadg);
            return;
        }
        if (action instanceof n2) {
            wp wpVar = ((n2) action).f57716iobyxmoadg;
            if (!(wpVar instanceof so)) {
                if (!(wpVar instanceof lm) && !(wpVar instanceof nn)) {
                    throw new NoWhenBranchMatchedException();
                }
                z13 = true;
            }
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(wpVar);
            ij ijVar2 = (ij) this.f58997iobyxmoadg;
            ijVar2.ppxfxbqfkf(ln.iobyxmoadg(ijVar2.iobyxmoadg(), kcexrzcfytVar, null, z13, 2));
            return;
        }
        if (action instanceof g) {
            hl hlVar = ((g) action).f56604iobyxmoadg;
            if ((hlVar instanceof pv) || (hlVar instanceof g60) || (hlVar instanceof wg) || (hlVar instanceof w7) || (hlVar instanceof vg0) || (hlVar instanceof t6)) {
                ij ijVar3 = (ij) this.f58997iobyxmoadg;
                ijVar3.ppxfxbqfkf(ln.iobyxmoadg(ijVar3.iobyxmoadg(), hlVar, null, true, 2));
                return;
            }
            return;
        }
        if (action instanceof hj) {
            ij ijVar4 = (ij) this.f58997iobyxmoadg;
            ijVar4.ppxfxbqfkf(ln.iobyxmoadg(ijVar4.iobyxmoadg(), new a40(((hj) action).f56933iobyxmoadg), null, false, 2));
            return;
        }
        if (action instanceof l1) {
            kc kcVar = ((l1) action).f57370iobyxmoadg;
            if (kcVar instanceof z8) {
                ErrorEntity errorEntity = ((z8) kcVar).f59540iobyxmoadg;
                l00Var = errorEntity instanceof ErrorEntity.NotEnoughMoneyForPayment ? new l00(ph.f58085iobyxmoadg) : new w7(errorEntity);
                z13 = true;
            } else if (kcVar instanceof fa) {
                l00Var = y8.f59394iobyxmoadg;
            } else {
                if (!(kcVar instanceof ib)) {
                    throw new NoWhenBranchMatchedException();
                }
                l00Var = ea.f56393iobyxmoadg;
            }
            ij ijVar5 = (ij) this.f58997iobyxmoadg;
            ijVar5.ppxfxbqfkf(ln.iobyxmoadg(ijVar5.iobyxmoadg(), l00Var, null, z13, 2));
            return;
        }
        if (action instanceof iwxlajgraz) {
            b4 b4Var = ((iwxlajgraz) action).f57103iobyxmoadg;
            if (b4Var instanceof v1) {
                gtVar = cs.f56183iobyxmoadg;
            } else {
                if (!(b4Var instanceof w2)) {
                    throw new NoWhenBranchMatchedException();
                }
                gtVar = new gt(((w2) b4Var).f59084iobyxmoadg);
                z13 = true;
            }
            ij ijVar6 = (ij) this.f58997iobyxmoadg;
            ijVar6.ppxfxbqfkf(ln.iobyxmoadg(ijVar6.iobyxmoadg(), gtVar, null, z13, 2));
            return;
        }
        if (action instanceof t4) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(new g1(((t4) action).f58613iobyxmoadg));
            return;
        }
        if (action instanceof v5) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(new i2(((v5) action).f58952iobyxmoadg));
            return;
        }
        if (action instanceof fi0) {
            fi0 fi0Var = (fi0) action;
            iobyxmoadg(fi0Var.f56571iobyxmoadg, fi0Var.f56572zoijcleaow);
            return;
        }
        if (action instanceof ah0) {
            ij ijVar7 = (ij) this.f58997iobyxmoadg;
            ijVar7.ppxfxbqfkf(ln.iobyxmoadg(ijVar7.iobyxmoadg(), new j3(((ah0) action).f55821iobyxmoadg), null, true, 2));
            return;
        }
        if (action instanceof js) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(pe.f58074iobyxmoadg);
            return;
        }
        if (action instanceof hy) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(cj.f56169iobyxmoadg);
            return;
        }
        if (action instanceof wf) {
            ij ijVar8 = (ij) this.f58997iobyxmoadg;
            ijVar8.ppxfxbqfkf(ln.iobyxmoadg(ijVar8.iobyxmoadg(), new pv("Не удалось пройти аутентификацию"), null, true, 2));
            return;
        }
        if (action instanceof cqumvgiudr) {
            ij ijVar9 = (ij) this.f58997iobyxmoadg;
            ijVar9.ppxfxbqfkf(ln.iobyxmoadg(ijVar9.iobyxmoadg(), new o4(((cqumvgiudr) action).f56180iobyxmoadg), null, true, 2));
            return;
        }
        if (action instanceof ribwqtqdhb) {
            iobyxmoadg(((ribwqtqdhb) action).f58365iobyxmoadg, 45000L);
            return;
        }
        if (action instanceof ja) {
            ((ja) action).f57170iobyxmoadg.invoke();
            return;
        }
        if (action instanceof d9) {
            ((d9) action).f56240iobyxmoadg.invoke();
            return;
        }
        if (action instanceof mb) {
            mb mbVar = (mb) action;
            Boolean bool2 = mbVar.f57619ppxfxbqfkf;
            if (bool2 != null && (bool = mbVar.f57618iobyxmoadg) != null && (tool = mbVar.f57621zoijcleaow) != null) {
                this.f58999wkgbmnqykc = new mb(bool, tool, bool2, mbVar.f57620wkgbmnqykc);
            }
            xf xfVar2 = this.f58997iobyxmoadg;
            Boolean bool3 = mbVar.f57618iobyxmoadg;
            if (bool3 != null) {
                zBooleanValue = bool3.booleanValue();
            } else {
                mb mbVar2 = this.f58999wkgbmnqykc;
                Boolean bool4 = mbVar2 != null ? mbVar2.f57618iobyxmoadg : null;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(bool4);
                zBooleanValue = bool4.booleanValue();
            }
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = mbVar.f57621zoijcleaow;
            if (tool2 == null) {
                mb mbVar3 = this.f58999wkgbmnqykc;
                tool2 = mbVar3 != null ? mbVar3.f57621zoijcleaow : null;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(tool2);
            }
            Boolean bool5 = mbVar.f57619ppxfxbqfkf;
            if (bool5 != null) {
                zBooleanValue2 = bool5.booleanValue();
            } else {
                mb mbVar4 = this.f58999wkgbmnqykc;
                Boolean bool6 = mbVar4 != null ? mbVar4.f57619ppxfxbqfkf : null;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(bool6);
                zBooleanValue2 = bool6.booleanValue();
            }
            n80 n80Var2 = mbVar.f57620wkgbmnqykc;
            if (n80Var2 == null) {
                mb mbVar5 = this.f58999wkgbmnqykc;
                if (mbVar5 != null) {
                    n80Var = mbVar5.f57620wkgbmnqykc;
                }
            } else {
                n80Var = n80Var2;
            }
            if (zBooleanValue) {
                if (((auzgnhcxok) this.f59000zoijcleaow).f55862ojitshcjhn) {
                    ErrorEntity.DoubleOtpCall sPayApiError = ErrorEntity.DoubleOtpCall.INSTANCE;
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayApiError, "sPayApiError");
                }
                auzgnhcxok auzgnhcxokVar = (auzgnhcxok) this.f59000zoijcleaow;
                auzgnhcxokVar.f55862ojitshcjhn = true;
                MerchantData merchantData = auzgnhcxokVar.f55859lmojexxdyd;
                if (merchantData == null) {
                    throw Cn.f70541zdlpuopuiu;
                }
                ua0Var = new ntlheqmsrt(new n9(merchantData.getAuthorization(), new CreateOtpSdkRequestBody(merchantData.getOrderId(), ((auzgnhcxok) this.f59000zoijcleaow).gtknphoqwx(), tool2.getPaymentId())), new sd(this, tool2, zBooleanValue2, n80Var));
            } else {
                ua0Var = ((PayStrategy) ((auzgnhcxok) this.f59000zoijcleaow).f55853iozdgvuglv.getValue()) instanceof DeprecatedPaymentMethod ? new ua0(tool2, zBooleanValue2) : new q90(tool2, zBooleanValue2, n80Var);
            }
            ((ij) xfVar2).zoijcleaow(ua0Var);
            return;
        }
        if (action instanceof za0) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(new a40(new he()));
            ij ijVar10 = (ij) this.f58997iobyxmoadg;
            za0 za0Var = (za0) action;
            ijVar10.ppxfxbqfkf(ln.iobyxmoadg(ijVar10.iobyxmoadg(), new qo(za0Var.f59557iobyxmoadg, za0Var.f59559zoijcleaow), null, false, 2));
            return;
        }
        if (action instanceof zw) {
            ij ijVar11 = (ij) this.f58997iobyxmoadg;
            ijVar11.ppxfxbqfkf(ln.iobyxmoadg(ijVar11.iobyxmoadg(), new pv("Системная или внутренняя ошибка"), null, true, 2));
            return;
        }
        if (action instanceof aq) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(new fk(((aq) action).f55833iobyxmoadg));
            return;
        }
        if (action instanceof ue) {
            ij ijVar12 = (ij) this.f58997iobyxmoadg;
            ijVar12.ppxfxbqfkf(ln.iobyxmoadg(ijVar12.iobyxmoadg(), hb.f56890iobyxmoadg, null, true, 2));
            return;
        }
        if (action instanceof j0) {
            sr srVar = ((j0) action).f57118iobyxmoadg;
            if (srVar instanceof go) {
                ayVar2 = new ay(ob0.f57923zoijcleaow);
            } else {
                if (srVar instanceof kp) {
                    ayVar = new ay(new xc0(((kp) srVar).f57336iobyxmoadg));
                } else if (srVar instanceof oq) {
                    ayVar = new ay(new ae0(((oq) srVar).f57990iobyxmoadg));
                } else if (srVar instanceof bn) {
                    ayVar = new ay(new f90(((bn) srVar).f56033iobyxmoadg));
                } else {
                    if (!(srVar instanceof zl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ayVar = new ay(new ja0(((zl) srVar).f59601iobyxmoadg));
                }
                ayVar2 = ayVar;
            }
            ij ijVar13 = (ij) this.f58997iobyxmoadg;
            ln lnVarIobyxmoadg = ijVar13.iobyxmoadg();
            gf0 gf0Var = ayVar2.f55879iobyxmoadg;
            ijVar13.ppxfxbqfkf(ln.iobyxmoadg(lnVarIobyxmoadg, ayVar2, null, (gf0Var instanceof ja0) || (gf0Var instanceof f90), 2));
            return;
        }
        if (action instanceof p3) {
            p3 p3Var = (p3) action;
            if (p3Var.f58032iobyxmoadg instanceof t10) {
                this.f58998ppxfxbqfkf.iobyxmoadg(new ow(lc.RS_FAIL_REVOKE_TOKEN_SDK, we0.PROFILE_VIEW, mp.RS_GOOD, null, null, null, null, 120));
                p3Var.f58032iobyxmoadg.iobyxmoadg().invoke();
                return;
            } else {
                this.f58998ppxfxbqfkf.iobyxmoadg(new ow(lc.RS_GOOD_REVOKE_TOKEN_SDK, we0.PROFILE_VIEW, mp.RS_GOOD, null, null, null, null, 120));
                p3Var.f58032iobyxmoadg.iobyxmoadg().invoke();
                return;
            }
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, b8.f55918iobyxmoadg)) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(ai0.f55825iobyxmoadg);
            return;
        }
        if (action instanceof vv) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(yh.f59452iobyxmoadg);
            return;
        }
        if (action instanceof oc) {
            ij ijVar14 = (ij) this.f58997iobyxmoadg;
            ln lnVarIobyxmoadg2 = ijVar14.iobyxmoadg();
            ((oc) action).getClass();
            ijVar14.ppxfxbqfkf(ln.iobyxmoadg(lnVarIobyxmoadg2, null, null, false, 3));
            return;
        }
        if (action instanceof di) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(new l00(((di) action).f56296iobyxmoadg));
            return;
        }
        if (action instanceof er) {
            ((auzgnhcxok) this.f59000zoijcleaow).f55845cqumvgiudr = HelperScenario.BNPL;
            ((ij) this.f58997iobyxmoadg).zoijcleaow(id0.f57031iobyxmoadg);
            return;
        }
        if (action instanceof nd0) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(e0.f56364iobyxmoadg);
            return;
        }
        if (action instanceof rd) {
            jlmebxxoox jlmebxxooxVar = this.f59000zoijcleaow;
            String id2 = ((rd) action).f58312iobyxmoadg;
            auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) jlmebxxooxVar;
            auzgnhcxokVar2.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
            auzgnhcxokVar2.f55858lereixgezr.setValue(id2);
            return;
        }
        if (action instanceof y6) {
            ((ij) this.f58997iobyxmoadg).zoijcleaow(zeieaojujs.f59572iobyxmoadg);
            return;
        }
        if (action instanceof qe0) {
            ij ijVar15 = (ij) this.f58997iobyxmoadg;
            ijVar15.ppxfxbqfkf(ln.iobyxmoadg(ijVar15.iobyxmoadg(), new q5(((qe0) action).f58184iobyxmoadg), null, true, 2));
            return;
        }
        if (action instanceof wf0) {
            ((auzgnhcxok) this.f59000zoijcleaow).ppxfxbqfkf(iwizpuwonk.ALL_RESPONSES);
            jlmebxxoox jlmebxxooxVar2 = this.f59000zoijcleaow;
            PayStrategy.PayOnline status = PayStrategy.PayOnline.INSTANCE;
            auzgnhcxok auzgnhcxokVar3 = (auzgnhcxok) jlmebxxooxVar2;
            auzgnhcxokVar3.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(status, "status");
            auzgnhcxokVar3.f55871yadqdtsiqt.setValue(status);
            ((ij) this.f58997iobyxmoadg).ppxfxbqfkf(new ln(e0.f56364iobyxmoadg, 6));
            return;
        }
        if (action instanceof rn) {
            ij ijVar16 = (ij) this.f58997iobyxmoadg;
            ijVar16.ppxfxbqfkf(ln.iobyxmoadg(ijVar16.iobyxmoadg(), b.f55885iobyxmoadg, null, false, 2));
        } else if (action instanceof ru) {
            ij ijVar17 = (ij) this.f58997iobyxmoadg;
            ijVar17.ppxfxbqfkf(ln.iobyxmoadg(ijVar17.iobyxmoadg(), new ez(((ru) action).f58472iobyxmoadg), null, false, 2));
        } else if (action instanceof nt) {
            ij ijVar18 = (ij) this.f58997iobyxmoadg;
            nt ntVar = (nt) action;
            ijVar18.ppxfxbqfkf(ln.iobyxmoadg(ijVar18.iobyxmoadg(), new rf(ntVar.f57842iobyxmoadg, ntVar.f57843zoijcleaow), null, false, 2));
        }
    }
}
