package com.example.ashwani.commotionindia.MediaFragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

import com.example.ashwani.commotionindia.R;



public class MediaDocumentationVideoAdapter extends RecyclerView.Adapter<MediaDocumentationVideoAdapter.VideoViewHOlder> {

    List<MediaDocumentationCard> youtubeVideoList;
    public MediaDocumentationVideoAdapter() {
    }

    public MediaDocumentationVideoAdapter(List<MediaDocumentationCard> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }

    @NonNull
    @Override
    public VideoViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.fragment_media_documentation_cardvideo,parent,false);
        return  new VideoViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHOlder hOlder, int position) {
        hOlder.videoWeb.loadData(youtubeVideoList.get(position).getVideoUrl(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }

    public class VideoViewHOlder extends RecyclerView.ViewHolder{
        WebView videoWeb;
        public VideoViewHOlder(@NonNull View itemView) {
            super(itemView);
            videoWeb=(WebView) itemView.findViewById(R.id.documentation_web_view);
            videoWeb.getSettings().setJavaScriptEnabled(true);

            videoWeb.setWebChromeClient(new WebChromeClient(){

            });
        }

    }
}