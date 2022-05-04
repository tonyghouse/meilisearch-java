package com.meilisearch.sdk.api.documents;

import java.util.Collections;
import java.util.List;

public class SearchRequest {
    private final String q;
    private final int offset;
    private final int limit;
    private final String[] filter;
    private final String[][] filterArray;
    private final List<String> attributesToRetrieve;
    private final List<String> attributesToCrop;
    private final int cropLength;
    private final String cropMarker;
    private final String highlightPreTag;
    private final String highlightPostTag;
    private final List<String> attributesToHighlight;
    private final boolean matches;
    private final List<String> sort;

    public SearchRequest(String q) {
        this(q, 0);
    }

    public SearchRequest(String q, int offset) {
        this(q, offset, 20);
    }

    public SearchRequest(String q, int offset, int limit) {
        this(q, offset, limit, Collections.singletonList("*"));
    }

    public SearchRequest(String q, int offset, int limit, List<String> attributesToRetrieve) {
        this(
                q,
                offset,
                limit,
                attributesToRetrieve,
                null,
                200,
                null,
                null,
                null,
                null,
                null,
                null,
                false,
                null);
    }

    public SearchRequest(
            String q,
            int offset,
            int limit,
            List<String> attributesToRetrieve,
            List<String> attributesToCrop,
            int cropLength,
            List<String> attributesToHighlight,
            String[] filter,
            boolean matches,
            List<String> sort) {
        this(
                q,
                offset,
                limit,
                attributesToRetrieve,
                null,
                200,
                null,
                null,
                null,
                null,
                filter,
                null,
                false,
                null);
    }

    public SearchRequest(
            String q,
            int offset,
            int limit,
            List<String> attributesToRetrieve,
            List<String> attributesToCrop,
            int cropLength,
            List<String> attributesToHighlight,
            String[][] filterArray,
            boolean matches,
            List<String> sort) {
        this(
                q,
                offset,
                limit,
                attributesToRetrieve,
                null,
                200,
                null,
                null,
                null,
                null,
                null,
                filterArray,
                false,
                null);
    }

    public SearchRequest(
            String q,
            int offset,
            int limit,
            List<String> attributesToRetrieve,
            List<String> attributesToCrop,
            int cropLength,
            String cropMarker,
            String highlightPreTag,
            String highlightPostTag,
            List<String> attributesToHighlight,
            String[] filter,
            boolean matches,
            List<String> sort) {
        this(
                q,
                offset,
                limit,
                attributesToRetrieve,
                null,
                200,
                cropMarker,
                highlightPreTag,
                highlightPostTag,
                null,
                filter,
                null,
                false,
                null);
    }

    public SearchRequest(
            String q,
            int offset,
            int limit,
            List<String> attributesToRetrieve,
            List<String> attributesToCrop,
            int cropLength,
            String cropMarker,
            String highlightPreTag,
            String highlightPostTag,
            List<String> attributesToHighlight,
            String[][] filterArray,
            boolean matches,
            List<String> sort) {
        this(
                q,
                offset,
                limit,
                attributesToRetrieve,
                null,
                200,
                cropMarker,
                highlightPreTag,
                highlightPostTag,
                null,
                null,
                filterArray,
                false,
                null);
    }

    public SearchRequest(
            String q,
            int offset,
            int limit,
            List<String> attributesToRetrieve,
            List<String> attributesToCrop,
            int cropLength,
            String cropMarker,
            String highlightPreTag,
            String highlightPostTag,
            List<String> attributesToHighlight,
            String[] filter,
            String[][] filterArray,
            boolean matches,
            List<String> sort) {
        this.q = q;
        this.offset = offset;
        this.limit = limit;
        this.attributesToRetrieve = attributesToRetrieve;
        this.attributesToCrop = attributesToCrop;
        this.cropLength = cropLength;
        this.cropMarker = cropMarker;
        this.highlightPreTag = highlightPreTag;
        this.highlightPostTag = highlightPostTag;
        this.attributesToHighlight = attributesToHighlight;
        this.filter = filter;
        this.filterArray = filterArray;
        this.matches = matches;
        this.sort = sort;
    }

    public String getQ() {
        return q;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public List<String> getAttributesToRetrieve() {
        return attributesToRetrieve;
    }

    public List<String> getAttributesToCrop() {
        return attributesToCrop;
    }

    public int getCropLength() {
        return cropLength;
    }

    public String getHighlightPreTag() {
        return highlightPreTag;
    }

    public String getHighlightPostTag() {
        return highlightPostTag;
    }

    public String getCropMarker() {
        return cropMarker;
    }

    public List<String> getAttributesToHighlight() {
        return attributesToHighlight;
    }

    public String[] getFilter() {
        return filter;
    }

    public String[][] getFilterArray() {
        return filterArray;
    }

    public List<String> getSort() {
        return sort;
    }

    public boolean isMatches() {
        return matches;
    }
}
