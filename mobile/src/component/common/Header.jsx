import styled from "styled-components"

export default function Header() {
    const Background = styled.div`
        height: 7vh;
        width: 100%;
        border-bottom: 2px solid #E0E0E0;
    `;

    return (
        <Background>
            <h1>Chapter.2</h1>
        </Background>
    )
}