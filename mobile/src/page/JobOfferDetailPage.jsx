import { useEffect, useState } from "react";
import Background from "../component/common/Background";
import axios from "axios";
import styled from "styled-components";
import { useParams } from "react-router-dom";

export default function JobOfferDetailPage() {
    const Title = styled.h1`

    `;

    const Author = styled.h3`
        
    `;

    const Description = styled.p`
        
    `;

    const { id } = useParams();
    const [title, setTitle] = useState('아주 맛있는 공고');
    const [description, setDescription] = useState('다들 개같이 침흘리며 들어온 역대급 공고');
    const [author, setAuthor] = useState('토스');

    useEffect(() => {
        axios.get("https://ca-hackerground-hgfyajoqog7sk.jollyforest-cf4e8105.koreacentral.azurecontainerapps.io/gooin/" + id)
            .then(res => {
                var data = res.data
                setTitle(data.title)
                setDescription(data.description)
                setAuthor(data.setAuthor)
            })
            .catch(err => {
                console.log(err);
            })
    }, [])

    return (
        <Background>
            <Title>{title}</Title>
            <Author>{author}</Author>
            <Description>{description}</Description>
        </Background>
    )
}