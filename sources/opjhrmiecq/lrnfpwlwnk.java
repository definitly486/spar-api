package opjhrmiecq;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class lrnfpwlwnk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final weqkydbzbr f73786iobyxmoadg = new ppxfxbqfkf(iobyxmoadg(new kotlin.jvm.internal.yadqdtsiqt() { // from class: opjhrmiecq.lrnfpwlwnk.zoijcleaow
        @Override // kotlin.jvm.internal.yadqdtsiqt, ah.wflxmlrfwp
        public Object get(Object obj) {
            return Boolean.valueOf(r.wkgbmnqykc.eablkybsjg(((r.zoijcleaow) obj).gxszxtbevo()));
        }
    }));

    public static final class iobyxmoadg implements weqkydbzbr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f73787iobyxmoadg;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f73787iobyxmoadg = draadjrbmkVar;
        }

        @Override // opjhrmiecq.weqkydbzbr
        public opjhrmiecq iobyxmoadg(KeyEvent keyEvent) {
            if (((Boolean) this.f73787iobyxmoadg.invoke(r.zoijcleaow.iobyxmoadg(keyEvent))).booleanValue() && r.wkgbmnqykc.gxszxtbevo(keyEvent)) {
                if (r.iobyxmoadg.vdvldrhtss(r.wkgbmnqykc.iobyxmoadg(keyEvent), mhtqkkgtqm.f73813iobyxmoadg.lereixgezr())) {
                    return opjhrmiecq.REDO;
                }
                return null;
            }
            if (((Boolean) this.f73787iobyxmoadg.invoke(r.zoijcleaow.iobyxmoadg(keyEvent))).booleanValue()) {
                long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.wkgbmnqykc()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.ojitshcjhn())) {
                    return opjhrmiecq.COPY;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.iwizpuwonk())) {
                    return opjhrmiecq.PASTE;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.cqumvgiudr())) {
                    return opjhrmiecq.CUT;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.iobyxmoadg())) {
                    return opjhrmiecq.SELECT_ALL;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.esjtqupxsv())) {
                    return opjhrmiecq.REDO;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.lereixgezr())) {
                    return opjhrmiecq.UNDO;
                }
                return null;
            }
            if (r.wkgbmnqykc.eablkybsjg(keyEvent)) {
                return null;
            }
            if (r.wkgbmnqykc.gxszxtbevo(keyEvent)) {
                long jIobyxmoadg2 = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.btonecajqb())) {
                    return opjhrmiecq.SELECT_LEFT_CHAR;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.gtknphoqwx())) {
                    return opjhrmiecq.SELECT_RIGHT_CHAR;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.draadjrbmk())) {
                    return opjhrmiecq.SELECT_UP;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.dxjokdxxww())) {
                    return opjhrmiecq.SELECT_DOWN;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.zdlpuopuiu())) {
                    return opjhrmiecq.SELECT_PAGE_UP;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.kcexrzcfyt())) {
                    return opjhrmiecq.SELECT_PAGE_DOWN;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.vdvldrhtss())) {
                    return opjhrmiecq.SELECT_LINE_START;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.rgvfuqvkyq())) {
                    return opjhrmiecq.SELECT_LINE_END;
                }
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.ojitshcjhn())) {
                    return opjhrmiecq.PASTE;
                }
                return null;
            }
            long jIobyxmoadg3 = r.wkgbmnqykc.iobyxmoadg(keyEvent);
            mhtqkkgtqm mhtqkkgtqmVar3 = mhtqkkgtqm.f73813iobyxmoadg;
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.btonecajqb())) {
                return opjhrmiecq.LEFT_CHAR;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.gtknphoqwx())) {
                return opjhrmiecq.RIGHT_CHAR;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.draadjrbmk())) {
                return opjhrmiecq.UP;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.dxjokdxxww())) {
                return opjhrmiecq.DOWN;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.nufgyqmvbu())) {
                return opjhrmiecq.CENTER;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.zdlpuopuiu())) {
                return opjhrmiecq.PAGE_UP;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.kcexrzcfyt())) {
                return opjhrmiecq.PAGE_DOWN;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.vdvldrhtss())) {
                return opjhrmiecq.LINE_START;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.rgvfuqvkyq())) {
                return opjhrmiecq.LINE_END;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.wflxmlrfwp()) || r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.oxmwwwfdhm())) {
                return opjhrmiecq.NEW_LINE;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.ppxfxbqfkf())) {
                return opjhrmiecq.DELETE_PREV_CHAR;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.lqeggnwhkg())) {
                return opjhrmiecq.DELETE_NEXT_CHAR;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.yggfygwlhe())) {
                return opjhrmiecq.PASTE;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.gxszxtbevo())) {
                return opjhrmiecq.CUT;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.eablkybsjg())) {
                return opjhrmiecq.COPY;
            }
            if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.jyumaefscl())) {
                return opjhrmiecq.TAB;
            }
            return null;
        }
    }

    public static final class ppxfxbqfkf implements weqkydbzbr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ weqkydbzbr f73788iobyxmoadg;

        ppxfxbqfkf(weqkydbzbr weqkydbzbrVar) {
            this.f73788iobyxmoadg = weqkydbzbrVar;
        }

        @Override // opjhrmiecq.weqkydbzbr
        public opjhrmiecq iobyxmoadg(KeyEvent keyEvent) {
            opjhrmiecq opjhrmiecqVar = null;
            if (r.wkgbmnqykc.gxszxtbevo(keyEvent) && r.wkgbmnqykc.eablkybsjg(keyEvent)) {
                long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.btonecajqb())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_LEFT_WORD;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.gtknphoqwx())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_RIGHT_WORD;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.draadjrbmk())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_PREV_PARAGRAPH;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.dxjokdxxww())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_NEXT_PARAGRAPH;
                }
            } else if (r.wkgbmnqykc.eablkybsjg(keyEvent)) {
                long jIobyxmoadg2 = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.btonecajqb())) {
                    opjhrmiecqVar = opjhrmiecq.LEFT_WORD;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.gtknphoqwx())) {
                    opjhrmiecqVar = opjhrmiecq.RIGHT_WORD;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.draadjrbmk())) {
                    opjhrmiecqVar = opjhrmiecq.PREV_PARAGRAPH;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.dxjokdxxww())) {
                    opjhrmiecqVar = opjhrmiecq.NEXT_PARAGRAPH;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.agtfadlqog())) {
                    opjhrmiecqVar = opjhrmiecq.DELETE_PREV_CHAR;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.lqeggnwhkg())) {
                    opjhrmiecqVar = opjhrmiecq.DELETE_NEXT_WORD;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.ppxfxbqfkf())) {
                    opjhrmiecqVar = opjhrmiecq.DELETE_PREV_WORD;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.zoijcleaow())) {
                    opjhrmiecqVar = opjhrmiecq.DESELECT;
                }
            } else if (r.wkgbmnqykc.gxszxtbevo(keyEvent)) {
                long jIobyxmoadg3 = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar3 = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.vdvldrhtss())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_LINE_START;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg3, mhtqkkgtqmVar3.rgvfuqvkyq())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_LINE_END;
                }
            } else if (r.wkgbmnqykc.wkgbmnqykc(keyEvent)) {
                long jIobyxmoadg4 = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar4 = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg4, mhtqkkgtqmVar4.ppxfxbqfkf())) {
                    opjhrmiecqVar = opjhrmiecq.DELETE_FROM_LINE_START;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg4, mhtqkkgtqmVar4.lqeggnwhkg())) {
                    opjhrmiecqVar = opjhrmiecq.DELETE_TO_LINE_END;
                }
            }
            return opjhrmiecqVar == null ? this.f73788iobyxmoadg.iobyxmoadg(keyEvent) : opjhrmiecqVar;
        }
    }

    public static final weqkydbzbr iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
        return new iobyxmoadg(draadjrbmkVar);
    }

    public static final weqkydbzbr zoijcleaow() {
        return f73786iobyxmoadg;
    }
}
