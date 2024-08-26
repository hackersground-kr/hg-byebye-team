import styled from "styled-components"

export default function Background(props) {
    const Ground = styled.div`
        height: 79vh;
        width: 94%;
        background-color: ${(props) => props.color? props.color:"white"};
        overflow-y: scroll;
        padding: 3%;
    `;

    return (
        <Ground color={props.color}>{props.children}</Ground>
    )
}