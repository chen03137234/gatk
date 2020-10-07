package org.broadinstitute.hellbender.transformers;

import org.broadinstitute.hellbender.utils.BaseUtils;
import org.broadinstitute.hellbender.utils.read.GATKRead;

public class IUPACReadTransformer implements ReadTransformer {
    private static final long serialVersionUID = 1L;
    private boolean strictMode;

    public IUPACReadTransformer() {
        this.strictMode = false;
    }

    public IUPACReadTransformer(final boolean strictMode) {
        this.strictMode = strictMode;
    }

    @Override
    public GATKRead apply(GATKRead read) {
        read.setBases(BaseUtils.convertIUPACtoN(read.getBases(), strictMode, false));
        return read;
    }
}
