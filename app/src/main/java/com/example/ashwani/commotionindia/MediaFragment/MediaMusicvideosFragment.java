package com.example.ashwani.commotionindia.MediaFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Vector;


import com.example.ashwani.commotionindia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MediaMusicvideosFragment extends Fragment {
    View root;
    RecyclerView recyclerView;
    Vector youtubeVideos=new Vector();



    public MediaMusicvideosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_media_musicvideos, container, false);
        recyclerView=root.findViewById(R.id.media_musicvideos_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //load video list
        youtubeVideos.add(new MediaMusicvideosCard("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ql33DIx17qg?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>  "));
        youtubeVideos.add(new MediaMusicvideosCard("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ul3L9AV4-mM?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>  "));
        youtubeVideos.add(new MediaMusicvideosCard("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qLScskhJNtw?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        //youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        //youtubeVideos.add(new MediaCampuson("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lXvX8zpKeB8?ecver=1\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        MediaMusicvideosVideoAdapter videoAdapter =new MediaMusicvideosVideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);
        return root;
    }

}

